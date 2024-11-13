import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numeros = new int[n];
        int[] invert = new int[n];

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = scanner.nextInt();
        }
        for (int i = 0; i < numeros.length; i++){
            invert[i] = numeros[numeros.length - 1 - i];
        }
        for (int i = 0; i < numeros.length; i++){
            System.out.print(invert[i] + " ");
        }
    }
}