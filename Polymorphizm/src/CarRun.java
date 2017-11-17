public class CarRun {

    public static void main(String[] args) {

        Car lada2104 = new Lada();

        lada2104.drive();
        lada2104.stop();

        System.out.println("Дверей: " + lada2104.doors);
        System.out.println("Колёс: " + lada2104.wheels);
        //////////////////////////////////////////////////////////////////////////////////
        Lada lada2107 = new Lada();

        lada2107.drive();
        lada2107.rust();
        lada2107.toBreakRules();

        System.out.println("Дверей: " + lada2107.doors);
        System.out.println("Колёс: " + lada2107.wheels);

    }

}
