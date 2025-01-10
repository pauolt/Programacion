import java.util.Scanner;

public class Main {

    public static boolean getAge(int age){
        boolean underage = true;
        if (age >= 18){
            underage = false;
        }
        return underage;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (!getAge(age)){
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }

    }
}