import java.util.Scanner;

public class Main {

    public static float KmToMiles(){
        Scanner scanner = new Scanner(System.in);
        float dist = scanner.nextFloat();
        return dist * 0.6214f;

    }

    public static void main(String[] args) {

        System.out.println(KmToMiles());
    }
}