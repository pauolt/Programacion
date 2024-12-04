import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++){
            numeros[i] = scanner.nextInt();
        }

        int inicial = scanner.nextInt();
        int finale = scanner.nextInt();

        for (int i = 0; i < n; i++){
            if (inicial < 0 || inicial > n || finale < 0 || finale > n){
                System.out.println("OutOfBounds");
                break;
            }
            if (inicial == finale) {
                System.out.println("Empty");
                break;
            }
            if(i >= inicial && i < finale){
                System.out.print(numeros[i] + " ");
            }
        }
    }
}