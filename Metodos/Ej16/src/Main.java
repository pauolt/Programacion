import java.util.Scanner;

public class Main {

    public static boolean getAge(int age){
        boolean overage = false;
        if (age >= 18){
            overage = true;
        }
        return overage;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println(getAge(age));

    }
}