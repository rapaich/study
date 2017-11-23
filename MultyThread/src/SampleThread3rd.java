public class SampleThread3rd extends Thread {

    @Override
    public void run() {
        super.run();

        for (int i = 0; i < 10; i++) {
            System.out.println("Я третий поток!");
            try {
                Thread.sleep(187);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
