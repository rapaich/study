public class ExampleConditionSwitch {
    public static void main(String[] args) {

        byte b = 20;

        switch (b) {
            case 1:
                System.out.println("Значение b равно одному");
                break;
            case 2:
                System.out.println("Значение b равно двум");
                break;
            default:
                System.out.println("Такого числа я не знаю");
                break;
        }

    }
}
