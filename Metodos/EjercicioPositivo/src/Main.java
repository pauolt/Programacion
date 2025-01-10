import java.util.Scanner;

public class Main {

    public static int getDist(int d1, int d2){
        return  Math.max(d1, d2) - Math.min(d1, d2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d1 = scanner.nextInt();
        int d2 = scanner.nextInt();
        int meta = scanner.nextInt();

        System.out.println("Distancia entre los coches: " + getDist(d1, d2));
        System.out.println("Distancia del coche 1 hasta la meta: " + getDist(d1, meta));
        System.out.println("Distancia del coche 2 hasta la meta: " + getDist(d2, meta));

    }
}