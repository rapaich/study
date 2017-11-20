import java.util.Scanner;

public class ScannerRun {

    public static void main(String[] args) {
        System.out.println("Введите текст:");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println("Вы ввели: " + str);

        scan.close();

    }

}
