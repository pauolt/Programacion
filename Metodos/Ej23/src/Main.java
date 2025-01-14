import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[random.nextInt(2,10)];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(0,100);
        }
        printArray(array);
    }
}