//...AKASH KESHRI...//
#include<bits/stdc++.h>
using namespace std;
#define gc getchar_unlocked
#define fo(i,n) for(i=0;i<n;i++)
#define Fo(i,k,n) for(i=k;k<n?i<n:i>n;k<n?i+=1:i-=1)
#define ll long long
#define deb(x) cout << #x << "=" << x << endl
#define deb2(x, y) cout << #x << "=" << x << "," << #y << "=" << y << endl
#define all(x) x.begin(), x.end()
#define clr(x) memset(x, 0, sizeof(x))
#define sortall(x) sort(all(x))
#define PI 3.1415926535897932384626
#define MOD (int)(1e9+7)
#define INF 1000000000
typedef pair<int, int>	pii;
typedef vector<int>		vi;
typedef vector<pii>		vpii;
typedef vector<vi>		vvi;
//=======================
ll fastpow(ll a,ll b,ll m)
{
    if(b==0) return 1;
    ll val=fastpow(a,b/2,m);
    if(b%2==1)
    {
        return (((a * val) %m) * val)%m;
    }
    else
    {
        return (val*val)%m;
    }

}
bool check(vector<int>&a,int n){
    if(n==0 || n==1) return true;
    return a[n - 1] >= a[n - 2] && check(a, n - 1);
}
void dfs(int source,vector<vector<int>>&graph,vector<bool>&vis){
    vis[source]=true;
    for(auto it:graph[source]){
        if(!vis[it]){
            dfs(it,graph,vis);
        }
    }
}
void solve()
{
   ll n;
   cin>>n;
   vector<ll> a(n);
   for(ll i=0;i<n;i++){
       cin>>a[i];
   }
   ll minNum = (2*a[0]-1), ans = 0;
   for(ll i = 1; i<n; i++){
       if((minNum)>a[i])
       continue;
       if(a[i]%minNum == 0){
           ans += ((a[i]/minNum)-1);
       }
       else
       ans += (a[i]/minNum);
   }
   cout << ans << endl;
} 
int main() {
    ios_base::sync_with_stdio(0), cin.tie(0), cout.tie(0);
     ll t;
     cin>>t;
     while(t--){
        solve();
    }
    return 0;
}