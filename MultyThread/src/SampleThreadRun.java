public class SampleThreadRun {

    public static void main(String[] args) throws InterruptedException {

        SampleThread threadSecond = new SampleThread();
        SampleThread3rd thread3rd = new SampleThread3rd();
        threadSecond.start();
        thread3rd.run();

        print();

    }

    private static void print() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("Я первый поток!");
            Thread.sleep(300);
        }
    }

}
