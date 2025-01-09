import java.util.Scanner;

public class Main {

    public static int pedirNum(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        System.out.println(pedirNum());
    }
}