import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] numeros = new float[10];
        float suma = 0;
        for (int i=0; i<numeros.length; i++){
            numeros[i] = scanner.nextFloat();
        }
        for (int i=0; i<numeros.length; i++){
            suma += numeros[i];
        }
        System.out.println(suma);
    }
}