public class ExampleMethodWithParameters {
    public static void main(String[] args) {
        methodOne((byte) 3);
        methodTwo((byte) 100);
        System.out.println(methodTwo((byte) 99));
    }
    static void methodOne (byte b) {
        System.out.println("В качестве аргументов мне передали " + b);
    }
    static byte methodTwo (byte b) {
        System.out.println("В качестве аргументов мне передали " + b);
        return (byte) (b + 5);
    }
}
