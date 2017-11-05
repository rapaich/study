public class BirdRun {
    public static void main(String[] args) {

        Bird woodpecker = new Bird();

        System.out.println("Мой вес " + woodpecker.weight);
        System.out.println("Мой размах крыльев " + woodpecker.wingspan);
        System.out.println("Моя максимальная скорость " + woodpecker.maxSpeed);
        System.out.println("Моя макмимальная высота полета " + woodpecker.maxHeight);

        Bird.fly();
        Bird.eat();
        Bird.walk();
        woodpecker.layEggs();

    }
}
