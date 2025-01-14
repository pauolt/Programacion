import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int[] createArray(int a){
        Random random = new Random();
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(0,100);
        }
        return array;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 0; i < createArray(a).length; i++){
            System.out.print(createArray(a)[i] + ", ");
        }

    }
}