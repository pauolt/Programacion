import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numeros = new int[n];
        boolean cap = false;

        for (int i = 0 ; i < numeros.length; i++){
            numeros[i] = scanner.nextInt();
        }
        for (int i = 0 ; i < numeros.length/2; i++){
            cap = numeros[i] == numeros[numeros.length - 1 - i];
        }
        System.out.println(cap);

    }
}