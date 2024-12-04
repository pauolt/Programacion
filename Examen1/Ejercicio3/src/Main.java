import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int anterior = scanner.nextInt();
        if (anterior != -1) {
            System.out.print(anterior + " ");
        }
        int contador = 0;

        while(true){
            if (anterior == -1){
                System.out.println("empty");
                break;
            }
            numero = scanner.nextInt();
            if (numero == -1){
                break;
            }
            contador++;
            if (numero == -1 && contador == 1){
                System.out.println(numero);
            }
            if (numero > anterior){
                System.out.print("<" + " ");
            }
            if (numero < anterior){
                System.out.print(">" + " ");
            }
            if (numero == anterior){
                System.out.print("=" + " ");
            }
            System.out.print(numero + " ");
            anterior = numero;
        }

    }
}