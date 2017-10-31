public class Calculate {
    public static void main(String[] args) {
        System.out.println("Calculate...");
        double first = Double.valueOf(args[0]);
        double second = Double.valueOf(args[1]);

        System.out.println("+: " + addOfTwoNumbers(first, second));
        System.out.println("-: " + defOfTwoNumbers(first, second));
        System.out.println("*: " + multTwoNumbers(first, second));
        System.out.println("/: " + delOfTwoNumbers(first, second));
        System.out.println("^: " + stepTwoNumbers(first, second));
    }

    private static double addOfTwoNumbers(double one, double two) {
        return one + two;
    }
    private static double defOfTwoNumbers(double one, double two) {
        return one - two;
    }
    private static double multTwoNumbers(double one, double two) {
        return one * two;
    }
    private static double delOfTwoNumbers(double one, double two) {
        return one / two;
    }
    private static double stepTwoNumbers(double one, double two) {
        return Math.pow(one, two);
    }
}
