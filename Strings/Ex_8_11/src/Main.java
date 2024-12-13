import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String t1 = scanner.nextLine();
        String t2 = scanner.nextLine();

        System.out.println(t1.toLowerCase().equals(t2.toLowerCase()));

    }

}
