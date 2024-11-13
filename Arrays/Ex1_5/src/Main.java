import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] numeros = new float[20];
        float suma = 0;
        for(int i=0; i < numeros.length; i++) {
            numeros[i] = scanner.nextFloat();
            suma += numeros[i];
        }
        System.out.println(suma/numeros.length);
    }
}