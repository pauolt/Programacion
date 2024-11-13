import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] numeros = new int[100];
        int[] posicion = new int[100];

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = random.nextInt(1, 10);
        }
        int n = scanner.nextInt();

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] == n){
                posicion[i] = i;
            }
        }
        for (int i=0; i < posicion.length; i++){
            if(posicion[i] != 0){
            System.out.println(posicion[i]);
            }
        }
    }
}