public class Lada extends Car{

    byte holes = 8;
    byte spoiler = 1;

    @Override
    void drive(){
        System.out.println("Я делаю вид что еду!");
    }
    void rust() {
        System.out.println("Я ржавею!");
    }
    void toBreakRules() {
        System.out.println("Тазы валят!");
    }
}
