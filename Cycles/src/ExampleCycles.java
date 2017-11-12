public class ExampleCycles {
    public static void main(String[] args) {

        byte a = 100;
        while (a >= 0) {
            System.out.print(a + " ");
            a = (byte) (a - 2);
        }
        System.out.println();

        byte b = 100;
        do {
            System.out.print(b + " ");
            b = (byte) (b - 2);
        } while (b >= 0);
        System.out.println();

        for (int i = 100; i >=0; i = i - 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    ////////////////////////////////////////////////////////////////////////////////////
        byte c = 10;
        while (c <= 50) {
            System.out.print(c + " ");
            c = (byte) (c + 3);
        }
        System.out.println();

        byte d = 10;
        do {
            System.out.print(d + " ");
            d = (byte) (d + 3);
        } while (d <= 50);
        System.out.println();

        for (int i = 10; i <= 50; i = i +3 ) {
            System.out.print(i + " ");
        }
    }
}
