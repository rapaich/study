public class ClockRunner {

    public static void main(String[] args) {

        Clock clock = new Clock();

        clock.setHours((byte) 22);
        clock.setMinutes((byte) 78);

        System.out.print(clock.getHours() + ":");
        System.out.println(clock.getMinutes());

    }

}
