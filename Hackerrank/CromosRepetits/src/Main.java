import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] contador = new int[68];

        for (int i = 0; i < n; i++){
            int cromo = scanner.nextInt();
            contador[cromo-1]++;
        }

        for (int i = 0; i < contador.length; i++){
            if (contador[i] > 1){
                System.out.println((i + 1)+ ": " + contador[i]);
            }
        }

    }
}