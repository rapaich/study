public class ExampleMultydumensialArray {

    public static void main(String[] args) {

        byte [][][] arr = new byte[2][3][1];

        arr[0][0][0] = 1;
        arr[0][1][0] = 2;
        arr[0][2][0] = 3;
        arr[1][0][0] = 4;
        arr[1][1][0] = 5;
        arr[1][2][0] = 6;

        for (int i = 0; i < 2; i++){

            for (int j = 0; j < 3; j++){

                for (int f = 0; f < 1; f++){

                    System.out.println(arr[i][j][f]);

                }
            }

        }

    }

}
