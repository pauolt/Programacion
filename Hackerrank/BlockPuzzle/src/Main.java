import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] tablero = new int[m][n];
        int[][] jugada  = new int[m][n];
        boolean correcta = true;

        for (int i = 0; i < tablero.length; i++){
            for (int j = 0; j < tablero[i].length; j++){
                tablero[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < jugada.length; i++){
            for (int j = 0; j < jugada[i].length; j++){
                jugada[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < jugada.length; i++){
            for (int j = 0; j < jugada[i].length; j++){
                if (tablero[i][j] == jugada[i][j] && tablero[i][j] == 1 && jugada[i][j] == 1){
                    correcta = false;
                }
            }
        }

        System.out.println(correcta);

    }
}