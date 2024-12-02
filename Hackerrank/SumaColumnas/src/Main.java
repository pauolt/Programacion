import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        int c = scanner.nextInt();
        int[][] numeros = new int[f][c];
        int [] resultado = new int[c];


        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){
                numeros[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < c; i++){
            int suma = 0;
            for (int j = 0; j < numeros.length; j++){
                suma += numeros[j][i];
            }
            resultado[i] = suma;
        }

        for (int i = 0; i < resultado.length; i++){
            System.out.print(resultado[i] + " ");
        }
    }
}
