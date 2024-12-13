import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String texto = "JuAn gOMez perEZ";

        String minus = texto.toLowerCase();

        String[] minusPartes = minus.split(" ");

        for (int i = 0; i < minusPartes.length; i++){
            String letra1 = minusPartes[i].substring(0,1);
            String resto = minusPartes[i].substring(1);

            System.out.println(letra1.toUpperCase() + resto);
        }

    }
}