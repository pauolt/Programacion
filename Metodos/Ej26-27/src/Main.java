import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static int[] createArray(){
        int[] array = new int[ThreadLocalRandom.current().nextInt(2,10)];
        for (int i = 0; i < array.length; i++){
            array[i] = ThreadLocalRandom.current().nextInt(1,100);
        }
        return array;
    }

    public static int[] changeArray(int[] array, int num){
        int[] new_array = new int[num];

        for (int i = 0; i < new_array.length; i++){
            new_array[i] = 0;
        }
        for (int i = 0; i < array.length; i++){
            new_array[i] = array[i];
        }

        return new_array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = createArray();
        printArray(array);
        System.out.println();
        int num = scanner.nextInt();
        printArray(changeArray(array, num));

    }
}