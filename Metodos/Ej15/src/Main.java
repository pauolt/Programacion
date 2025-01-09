import java.util.Scanner;

public class Main {

    public static float multFloat(){
        Scanner scanner = new Scanner(System.in);
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();

        return num1*num2;
    }

    public static void main(String[] args) {
        System.out.println(multFloat());

    }
}