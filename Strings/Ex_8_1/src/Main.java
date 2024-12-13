import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String palabra = scanner.nextLine();

        for (int i = 0; i < palabra.length(); i++){
            System.out.println(palabra.charAt(i));
        }
    }
}