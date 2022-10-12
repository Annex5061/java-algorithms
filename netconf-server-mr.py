from __future__ import absolute_import, division, unicode_literals, print_function, nested_scopes
import io
import logging
import os
import sys
import threading
import paramiko as ssh
from lxml import etree
import sshutil.server

from netconf import base
import netconf.error as ncerror
from netconf import NSMAP
from netconf import qmap
from netconf import util

if sys.platform == 'win32' and sys.version_info < (3, 5):
    import backports.socketpair  # pylint: disable=E0401,W0611

logger = logging.getLogger(__name__)

try:
    import pam
    have_pam = True
except ImportError:
    have_pam = False


class SSHAuthorizedKeysController(ssh.ServerInterface):
    """An implementation of paramiko `ServerInterface` that utilizes users
    authorized keys file for authentication.
    :param users: A list of usernames whose authorized keys will allow access.
    """
    def __init__(self, users=None):
        self.event = threading.Event()
        self.users = users
        self.users_keys = {}
        if have_pam:
            self.pam = pam.pam()
        else:
            self.pam = None

    def get_user_auth_keys(self, username):
        """Parse the users's authorized_keys file if any to look for authorized keys"""
        if username in self.users_keys:
            return self.users_keys[username]

        self.users_keys[username] = []

        userdir = os.path.expanduser("~" + username)
        if not userdir:
            return self.users_keys[username]

        keyfile = os.path.join(userdir, ".ssh/authorized_keys")
        if not keyfile or not os.path.exists(keyfile):
            return self.users_keys[username]

        with open(keyfile) as f:
            for line in f.readlines():
                line = line.strip()
                if not line or line.startswith("#"):
                    continue
                values = [x.strip() for x in line.split()]

                exp = None
                try:
                    int(values[0])  # bits value?
                except ValueError:
                    # Type 1 or type 2, type 1 is bits in second value
                    options_ktype = values[0]
                    try:
                        int(values[1])  # bits value?
                    except ValueError:
                        # type 2 with options
                        ktype = options_ktype
                        data = values[1]
                    else:
                        # Type 1 no options.
                        exp = int(values[1])
                        data = values[2]
                else:
                    # Type 1 no options.
                    exp = int(values[1])
                    data = values[2]

                # XXX For now skip type 1 keys
                if exp is not None:
                    continue

                if data:
                    import base64
                    if ktype == "ssh-rsa":
                        key = ssh.RSAKey(data=base64.decodebytes(data.encode('ascii')))
                    elif ktype == "ssh-dss":
                        key = ssh.DSSKey(data=base64.decodebytes(data.encode('ascii')))
                    else:
                        key = None
                    if key:
                        self.users_keys[username].append(key)
        return self.users_keys[username]

    def get_allowed_auths(self, username):
        # This is only called after the user fails some other authentication type.
        if self.users is None:
            users = [username]
        else:
            users = self.users
        allowed = []
        if username in users:
            if self.pam:
                allowed.append("password")

            if self.get_user_auth_keys(username):
                allowed.append("publickey")

        allowed = ",".join(allowed)
        logger.debug("Allowed methods for user %s: %s", str(username), allowed)
        return allowed

    def check_auth_none(self, unused_username):
        return ssh.AUTH_FAILED

    def check_auth_publickey(self, username, key):
        if not self.get_user_auth_keys(username):
            return ssh.AUTH_FAILED
        for ukey in self.users_keys[username]:
            if ukey == key:
                return ssh.AUTH_SUCCESSFUL
        return ssh.AUTH_FAILED

    def check_auth_password(self, username, password):
        # Don't allow empty user or empty passwords
        if not username or not password:
            return ssh.AUTH_FAILED
        if self.pam and self.pam.authenticate(username, password):
            return ssh.AUTH_SUCCESSFUL
        return ssh.AUTH_FAILED

    def check_channel_request(self, kind, chanid):
        if kind == "session":
            return ssh.OPEN_SUCCEEDED
        return ssh.OPEN_FAILED_ADMINISTRATIVELY_PROHIBITED

    def check_channel_subsystem_request(self, channel, name):
        self.event.set()
        return name == "netconf"


# Backward compat
SSHAuthController = SSHAuthorizedKeysController


class SSHUserPassController(ssh.ServerInterface):
    """An implementation of paramiko `ServerInterface` that authorizes a single user
    and password.
    :param username: The username to allow.
    :param password: The password to allow.
    """
    def __init__(self, username=None, password=None):
        self.username = username
        self.password = password
        self.event = threading.Event()

    def get_allowed_auths(self, username):
        del username  # unused
        return "password"

    def check_auth_none(self, username):
        del username  # unused
        return ssh.AUTH_FAILED

    def check_auth_password(self, username, password):
        if self.username == username and self.password == password:
            return ssh.AUTH_SUCCESSFUL
        return ssh.AUTH_FAILED

    def check_channel_request(self, kind, chanid):
        if kind == "session":
            return ssh.OPEN_SUCCEEDED
        return ssh.OPEN_FAILED_ADMINISTRATIVELY_PROHIBITED

    def check_channel_subsystem_request(self, channel, name):
        self.event.set()
        return name == "netconf"


class NetconfServerSession(base.NetconfSession):
    """Netconf Server-side session with a client.
    This object will be passed to a the server RPC methods.
    """
    handled_rpc_methods = set(["close-session", "lock", "kill-session", "unlock"])

    def __init__(self, channel, server, unused_extra_args, debug):
        self.server = server

        sid = self.server._allocate_session_id()
        if debug:
            logger.debug("NetconfServerSession: Creating session-id %s", str(sid))

        self.methods = server.server_methods
        super(NetconfServerSession, self).__init__(channel, debug, sid)
        super(NetconfServerSession, self)._open_session(True)

        if self.debug:
            logger.debug("%s: Client session-id %s created", str(self), str(sid))

    def __del__(self):
        self.close()
        super(NetconfServerSession, self).__del__()

    def __str__(self):
        return "NetconfServerSession(sid:{})".format(self.session_id)

    def close(self):
        """Close the servers side of the session."""
        # XXX should be invoking a method in self.methods?
        if self.debug:
            logger.debug("%s: Closing.", str(self))

        # Cleanup any locks
        locked = self.server.unlock_target_any(self)
        method = getattr(self.methods, "rpc_unlock", None)
        if method is not None:
            try:
                # Let the user know.
                for target in locked:
                    method(self, None, target)
            except Exception as ex:
                if self.debug:
                    logger.debug("%s: Ignoring exception in rpc_unlock during close: %s", str(self),
                                 str(ex))
        try:
            super(NetconfServerSession, self).close()
        except EOFError:
            if self.debug:
                logger.debug("%s: EOF error while closing", str(self))

        if self.debug:
            logger.debug("%s: Closed.", str(self))