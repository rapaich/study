public class ExampleTypesConversion {

    public static void main(String[] args) {

        long sosiska = 1000000099900L;
        System.out.println(sosiska);
        byte abrikos = (byte) sosiska;
        System.out.println(abrikos);
        int kashtan = (int) sosiska;
        System.out.println(kashtan);

        int a = 300;
        int b =500;
        byte c = (byte)(a + b);
        System.out.println(c);

        byte d = 1;
        int zh = d;
        System.out.println(zh);

        int e = 7;
        byte k = (byte)e;
        System.out.println(k);

    }


}
