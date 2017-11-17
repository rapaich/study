public class DogRun {
    public static void main(String[] args) {

        Dachshund eva = new Dachshund();

        System.out.println(eva.age);
        System.out.println(eva.weight);

        eva.bark();
        eva.go();

        System.out.println(eva.getWool());
        eva.setWool("long");
        System.out.println(eva.getWool());

        System.out.println(eva.getLength());
        eva.setLength((byte)100);
        System.out.println(eva.getLength());

        Dog labrador = new Dog();
        System.out.println(labrador.age);
        System.out.println(labrador.weight);
    }
}
