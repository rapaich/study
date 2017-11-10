package PackageOne;

import PackageTwo.ClassC;

public class MainClass {
    public static void main(String[] args) {

        ClassA a = new ClassA();
        System.out.println(a.a + " " + a.b + " " + a.c);
        a.first();
        //A.second();   не выйдет, т.к. private
        a.third();

        ClassC.first();
        ClassC c = new ClassC();
        c.third();

    }
}
