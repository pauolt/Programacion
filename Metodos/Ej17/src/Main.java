import java.util.Scanner;

public class Main {

    public static int getMin(){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int menor = 0;
        if (num1 > num2){
            menor = num2;
        } else {
            menor = num1;
        }

        return menor;

    }

    public static void main(String[] args) {

        System.out.println(getMin());
    }
}