import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alto = scanner.nextInt();
        int ancho = scanner.nextInt();
        int[][] superior = new int[alto][ancho];
        int[][] inferior = new int[alto][ancho];

        for (int i = 0; i < superior.length; i++){
            for (int j = 0; j < superior[i].length; j++){
                superior[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < inferior.length; i++){
            for (int j = 0; j < inferior[i].length; j++){
                inferior[i][j] = scanner.nextInt();
            }
        }

        scanner.nextLine();
        scanner.nextLine();
        String modo = scanner.nextLine();


        int[][] resultado = new int[alto][ancho];
        if (modo.equals("ADD")){
            for (int i = 0; i < inferior.length; i++){
                for (int j = 0; j < inferior[i].length; j++){
                    resultado[i][j] = superior[i][j] + inferior [i][j];
                }
            }
        }

        if (modo.equals("NORMAL")){
            for (int i = 0; i < inferior.length; i++){
                for (int j = 0; j < inferior[i].length; j++){
                    if (superior[i][j] != 0){
                        resultado[i][j] = superior[i][j];
                    } else{
                        resultado[i][j] = inferior[i][j];
                    }
                }
            }
        }

        for (int i = 0; i < inferior.length; i++){
            for (int j = 0; j < inferior[i].length; j++){
                System.out.print(resultado [i][j] + " ");
            }
            System.out.println();
        }
    }
}