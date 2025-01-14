import java.util.Scanner;

public class Main {

    public static int[] getRectangle(int b, int a){
        int area = b*a;
        int per = (2*b)+(2*a);
        int[] resultado = new int[2];
        resultado[0] = area;
        resultado[1] = per;
        return resultado;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int altura = scanner.nextInt();
        for (int i = 0; i < getRectangle(base, altura).length; i++){
            System.out.println(getRectangle(base, altura)[i]);
        }
    }
}