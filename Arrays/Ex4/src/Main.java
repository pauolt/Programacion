import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numeros = new int[n];
        int cont = -1;

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = scanner.nextInt();
        }
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] == numeros[numeros.length - 1]){
                cont++;
            }
        }
        System.out.println(cont);
    }
}