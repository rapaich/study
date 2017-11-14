public class ExampleArrays {

    public static void main(String[] args) {

        byte[] massiv = new byte[20];

        byte a = 0;
        while(a < massiv.length) {
            massiv[a] = a;
            System.out.print(massiv[a] + " ");
            a++;
        }
        System.out.println();
        for (byte i = 19; i >=0; i--) {
            massiv[i] = i;
            System.out.print(massiv[i] + " ");
        }
        System.out.println();
        for (byte i = 0; i < massiv.length; i = (byte)(i + 2)){
            massiv[i] = i;
            System.out.print(massiv[i] + " ");
        }
        System.out.println();

        Ball[] balls = new Ball[7];

        for (byte i = 0; i < balls.length; i++){
            balls[i] = new Ball();
            System.out.print(balls[i].speed = (byte)(Math.random() * i + 1));
            System.out.print(balls[i].weight = (byte)(Math.random() * i + 1));
            System.out.println();
        }

    }

}
