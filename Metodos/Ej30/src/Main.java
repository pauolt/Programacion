import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static int[] createArray(){
        int[] array = new int[ThreadLocalRandom.current().nextInt(3,15)];
        for (int i : array){
            array[i] = ThreadLocalRandom.current().nextInt(1,50);
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i : array){
            System.out.print(array[i] + " ");
        }
    }

    public static int[] filterAndTransform(int[] array, int l, int m){
        int cont = 0;
        for (int i : array){
            if (array[i] <= l){
                cont++;
            }
        }

        int[] new_array = new int[cont];
        int pos = 0;

        for (int i : array){
            if (array[i] <= l){
                new_array[pos] = array[i] * m;
                pos++;
            }
        }
        return new_array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = createArray();
        printArray(array);
        System.out.println();
        int l = scanner.nextInt();
        int m = scanner.nextInt();
        printArray(filterAndTransform(array, l, m));
    }
}