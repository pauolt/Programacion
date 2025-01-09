import java.util.Scanner;

public class Main {

    public static boolean getAge(){
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        boolean overage = false;
        if (age >= 18){
            overage = true;
        }
        return overage;

    }
    public static void main(String[] args) {
        System.out.println(getAge());

    }
}