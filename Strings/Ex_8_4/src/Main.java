import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String palabra = scanner.nextLine();

        System.out.println(palabra.substring(palabra.indexOf("-")+1, palabra.lastIndexOf("-")));
    }
}