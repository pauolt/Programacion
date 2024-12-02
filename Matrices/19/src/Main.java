import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[][] matriz = {
                {11, 22, 33},
                {44, 55, 66, 55, 22},
                {77, 88}};

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
            if (matriz[i].length > mayor){
                mayor = matriz[i].length;
            }
        }
        for (int i = 0; i < matriz.length; i++){
            if (matriz[i].length == mayor){
                System.out.println("La fila con mas elementos es la " + i + " con " + matriz[i].length + " elementos");
            }
        }

    }
}