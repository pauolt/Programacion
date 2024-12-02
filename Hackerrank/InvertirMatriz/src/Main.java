import java.util.Scanner;
//
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        int c = scanner.nextInt();
        int[][] matriz = new int[f][c];
        int[][] invertida = new int[c][f];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < f; i++){
            for (int j = 0; j < c; j++){
                invertida[j][i] = matriz[i][j];
            }
        }

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; i++){
                System.out.println(invertida[i][j]);
            }
        }
    }
}