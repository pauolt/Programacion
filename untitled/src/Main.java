import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        for(int i=0; i<numeros.length; i++){
            numeros[i] = scanner.nextInt();
        }
        for(int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
}
