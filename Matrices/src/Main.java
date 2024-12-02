import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int f = scanner.nextInt();
        int c = scanner.nextInt();
        int suma = 0;
        int[][] matriz = new int[f][c];


        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = random.nextInt(1,101);
            }
        }

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Suma de filas:");

        for (int i = 0; i < matriz.length; i++){
            suma = 0;
            for (int j = 0; j < matriz[i].length; j++){
                suma += matriz[i][j];
            }
            System.out.println("La suma de la fila " + i + " es: " + suma);
        }

        System.out.println();
        System.out.println("Suma de columnas:");
        for (int i = 0; i < matriz.length; i++){
            suma = 0;
            for (int j = 0; j < matriz[i].length; j++){
                suma += matriz[j][i];

            }
            System.out.println("La suma de la columna " + i + " es: " + suma);
        }
        System.out.println();
        suma = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (j == i){
                    suma += matriz[i][j];
                }
            }
        }
        System.out.println("La suma de la diagonal principal es: " + suma);

        System.out.println();
        suma = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (i+j == matriz.length-1){
                    suma += matriz[i][j];
                }
            }
        }
        System.out.println("La suma de la diagonal secundaria es: " + suma);

    }
}
