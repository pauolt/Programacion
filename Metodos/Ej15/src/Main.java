import java.util.Scanner;

public class Main {

    public static float multFloat(float num1, float num2){
        return num1*num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num1 = scanner.nextFloat();
        float num2= scanner.nextFloat();
        System.out.println(multFloat(num1, num2));

    }
}