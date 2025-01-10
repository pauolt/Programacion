import java.util.Scanner;

public class Main {

    public static float KmToMiles(float km){
        return km * 0.6214f;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float dist = scanner.nextFloat();

        System.out.println(KmToMiles(dist));
    }
}