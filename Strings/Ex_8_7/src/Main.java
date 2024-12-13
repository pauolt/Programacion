import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        int posicionArroba = texto.indexOf("@");
        int posicionPunto = texto.indexOf(".");

        if (posicionArroba > 0 && posicionPunto > posicionArroba + 1 && posicionPunto != texto.length() - 1){
            System.out.println("Se parece a un email");
        }

    }
}