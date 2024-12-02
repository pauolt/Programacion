import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][3];
        Random random = new Random();
        int mayor = 0;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = random.nextInt(1,21);
            }
        }

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matriz.length; i++){
            mayor = 0;
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] > mayor){
                    mayor = matriz[i][j];
                }
            }
            System.out.print(mayor + ", ");
        }



    }
}