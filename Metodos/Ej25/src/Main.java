import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static int[] createArray(){
        int[] array = new int[ThreadLocalRandom.current().nextInt(5,15)];
        for (int i = 0; i < array.length; i++){
            array[i] = ThreadLocalRandom.current().nextInt(0,100);
        }
        return array;
    }

    public static int[] changeArray(int[] array, int num){
        if (num > array.length){
            return array;
        }
        int[] new_array = new int[num];
        System.arraycopy(array, 0, new_array, 0, new_array.length);
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