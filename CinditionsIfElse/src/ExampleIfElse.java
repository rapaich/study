public class ExampleIfElse {
    public static void main(String[] args) {
        byte b = 90;
        if (b < 50) {
            System.out.println("Меньше чем 50");
        }
        else if (b == 50) {
            System.out.println("Равно 50");
        }
        else if (b > 50) {
            System.out.println("Больше 50");
        }
        if (b == 1) {
            System.out.println("Переменная равна 1");
        }
        else if (b == 2) {
            System.out.println("Переменная равна 2");
        }
        else {
            System.out.println("Я такого числа не знаю");
        }
        if (b < 100) {
            System.out.println("Переменная хранит значение меньше 100");
        }
        if (b > 50) {
            System.out.println("Переменная хранит значение больше 50");
        }
    }
}
