import java.util.Formattable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int tam = scanner.nextInt();
        int cont = scanner.nextInt();
        int[] array = new int[tam];
        for (int i = 0; i < array.length; i++){
            array[i] = cont;
        }
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}