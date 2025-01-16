import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static boolean[] createBoolArray(){
        boolean[] array = new boolean[ThreadLocalRandom.current().nextInt(3,15)];
        for (int i = 0; i < array.length; i++){
            array[i] = ThreadLocalRandom.current().nextBoolean();
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            if (i == 0){
                System.out.println("true: " + array[i]);
            } else {
                System.out.println("false: " + array[i]);
            }
        }
    }

    public static void printBoolArray(boolean[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static int[] countBool(boolean[] array) {
        int[] contador = new int[2];
        for (int i = 0; i < array.length; i++){
            if (array[i]){
                contador[0]++;
            } else {
                contador[1]++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        boolean[] array = createBoolArray();
        printBoolArray(array);
        System.out.println();
        printArray(countBool(array));


    }
}