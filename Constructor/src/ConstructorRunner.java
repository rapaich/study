public class ConstructorRunner {

    public static void main(String[] args) {

        ExampleConsrtructor constr = new ExampleConsrtructor();
        System.out.println(ExampleConsrtructor.z);

        ExampleConsrtructor consrtructor = new ExampleConsrtructor(2,3,4,6);
        System.out.println(consrtructor.a);
        System.out.println(consrtructor.b);
        System.out.println(consrtructor.c);
        System.out.println(consrtructor.d);
    }

}
