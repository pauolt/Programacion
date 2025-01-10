import java.util.Scanner;

public class Main {

    public static int getMin( int num1,  int num2){
        return Math.min(num1, num2);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(getMin(num1 , num2));
    }
}