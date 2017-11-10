public class ExampleConsrtructor {
    static double z;
    int a;
    int b;
    int c;
    int d;

    public ExampleConsrtructor() {
        ExampleConsrtructor.z = 0.333333333332;
    }

    public ExampleConsrtructor(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;

        System.out.println("Меня создали !");
    }

}
