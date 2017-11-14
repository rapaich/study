public class OverloadingMethodsRun {
    public static void main(String[] args) {

        ExampleOverloadingMethods overload = new ExampleOverloadingMethods();

        overload.method((byte)5, 800,(long)767676767);
        overload.method((byte) -146, (long)78709809, 555);
        overload.method(777, (long)78709809,(byte)55);
        overload.method(888, (byte)9, (long) 5555555);
        overload.method((long)78709809, 555, (byte)-148);
        overload.method((long)78709809,(byte) 147, 555);

    }
}
