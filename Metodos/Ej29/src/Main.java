import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static int[] createArray(){
        int[] array = new int[ThreadLocalRandom.current().nextInt(3,15)];
        for (int i = 0; i < array.length; i++){
            array[i] = ThreadLocalRandom.current().nextInt(1,50);
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void limit (int[] array, int l) {
        for (int i = 0; i < array.length; i++){
            if (array[i] > l){
                array[i] = l;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = createArray();
        printArray(array);
        System.out.println();
        int l = scanner.nextInt();
        limit(array, l);
        printArray(array);
    }
}