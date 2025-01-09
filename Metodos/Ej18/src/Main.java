import java.util.Scanner;

public class Main {

    public static String getType(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String type = " ";

        if (num > 0){
            type = "positivo";
        }
        if (num < 0){
            type = "negativo";
        }
        if (num == 0){
            type = "cero";
        }

        return type;
    }

    public static void main(String[] args) {

        System.out.println(getType());

    }
}