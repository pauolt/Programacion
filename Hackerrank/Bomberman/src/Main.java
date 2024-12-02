import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        int c = scanner.nextInt();
        int[][] tablero = new int[f][c];

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = scanner.nextInt();
            }
        }

        int bomba = scanner.nextInt();

        int bombafila = -1;
        int bombacol = -1;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == bomba) {
                    bombafila = i;
                    bombacol = j;
                }
            }

        }
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (i == bombafila || j == bombacol) {
                    System.out.print("@");
                }else{
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}