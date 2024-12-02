import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] teclado = {"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "A", "S", "D", "F", "G", "H", "J", "K", "L", "Z", "X", "C", "V", "B", "N", "M"};
        int n = scanner.nextInt();
        int[] ordenes = new int[n];
        for (int i = 0; i < ordenes.length; i++){
            ordenes[i] = scanner.nextInt();
        }
        int pos = 0;
        for (int i = 0; i < ordenes.length; i++){
            pos += ordenes[i];
            System.out.print(teclado[pos]);
            if(pos < 0){
                pos = 0;
            }else if (pos > teclado.length-1){
                pos = teclado.length-1;
            }
        }

    }
}