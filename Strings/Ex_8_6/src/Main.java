import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String palabra = scanner.nextLine();
        boolean tiene = palabra.toLowerCase().contains("mundo");
        System.out.println(tiene);
    }
}