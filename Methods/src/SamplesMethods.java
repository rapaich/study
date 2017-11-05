public class SamplesMethods {
    public static void main(String[] args) {

        firstMethod();
        secondMethod();
        System.out.println("Ого метод returnOne что-то вернул! Он вернул число " + returnOne());
        System.out.println("Ого метод returnTwo что-то вернул! Он вернул число " + returnTwo());
        System.out.println("Числа из методов сложились и получилось число " + (returnOne() + returnTwo()));
    }

    static void firstMethod() {
        System.out.println("Я - первый метод. Звали?" );
    }
    static void secondMethod(){
        System.out.println("Я - второй метод. Звали?" );
    }
    static byte returnOne() {
        final byte a = 1;
        final byte b = 2;
        return a + b;
    }
    static byte returnTwo() {
        final byte c = 3;
        final byte d = 4;
        return c + d;
    }
}
