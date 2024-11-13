import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int tam = q-p+1;
        int[] numeros = new int[tam];
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = p + i;
        }
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
}