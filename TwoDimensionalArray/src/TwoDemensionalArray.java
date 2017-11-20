import java.util.Arrays;

public class TwoDemensionalArray {

    public static void main(String[] args) {

        char[][] arr = {{'*'},{'*','*'},{'*','*','*'},{'*','*','*','*'}};

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        String[] fruits = {"apple", "orange", "banana"};
        String[] trees = {"oak", "willow"};
        String[] planets = {"Earth", "Mercury", "Mars", "Venus"};
        String[][] array = {fruits, trees, planets};

        for (int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
