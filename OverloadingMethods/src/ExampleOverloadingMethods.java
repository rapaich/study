public class ExampleOverloadingMethods {

    void method(byte baptist, int innah, long sosiska) {
        System.out.println("first variant");
    }
    void method(int innah, byte baptist, long sosiska) {
        System.out.println("second variant");
    }
    void method(int innah, long siska, byte baptist) {
        System.out.println("third variant");
    }
    void method(long sosiska, int innah, byte bapti) {
        System.out.println("fourth variant");
    }
    void method(long sosiska, byte baptist, int innah) {
        System.out.println("fifth variant");
    }
    void method(byte baptist, long sosiska, int innah) {
        System.out.println("sixth variant");
    }

}
