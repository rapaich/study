public class BirdRun {
    public static void main(String[] args) {

        Bird woodpecker = new Bird();

        System.out.println("Мой вес " + woodpecker.weight);
        System.out.println("Мой размах крыльев " + woodpecker.wingspan);
        System.out.println("Моя максимальная скорость полёта " + woodpecker.maxSpeed);
        System.out.println("Моя максимальная высота полёта " + woodpecker.maxHeight);

        woodpecker.fly();
        woodpecker.eat();
        woodpecker.walk();
        woodpecker.layEggs();

    }
}
