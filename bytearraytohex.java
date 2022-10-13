public class ByteHex {

    public static void main(String[] args) {

        byte[] bytes = {10, 2, 15, 11};

        for (byte b : bytes) {
            String st = String.format("%02X", b);
            System.out.print(st);
        }
    }
}
