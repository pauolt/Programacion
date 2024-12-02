import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        char[][] matriz = new char[0][];


        while(true) {
            char[] linea = scanner.nextLine().toCharArray();


            if (linea.length == 0) break;


            char[][] nuevaMatriz = new char[matriz.length+1][];

            for (int i = 0; i < nuevaMatriz.length; i++){
                for (int j = 0; j < nuevaMatriz[i].length; j++){
                    nuevaMatriz[i][j] = 'a';
                }
            }


            for (int i = 0; i < nuevaMatriz.length; i++){
                for (int j = 0; j < nuevaMatriz[i].length; j++){
                    nuevaMatriz[i][j] = matriz[i][j];
                }
            }


            nuevaMatriz[matriz.length] = linea;
            matriz = nuevaMatriz;
        }




        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
