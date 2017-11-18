public class CatRun {

    public static void main(String[] args) {

        Vaska vaska = new Vaska();

        vaska.gobbleUp();
        vaska.shit();
        System.out.println(vaska.tail);
        System.out.println(vaska.paws);

        Cat cat = vaska;
        System.out.println("У кота " + cat.paws + " лапки");

    }

}
