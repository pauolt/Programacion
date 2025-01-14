import java.util.Scanner;

public class Main {

    public static int getMAX(int a, int b){
        return Math.max(a, b);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(Math.max(getMAX(a, b), c));

    }
}