import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float[] numeros = new float[10];
        float min = Float.MAX_VALUE;
        float max = 0;
        for (int i=0; i<numeros.length; i++){
            numeros[i] = scanner.nextInt();
        }
        for (int i=0; i<numeros.length; i++){
            if(numeros[i] > max){
                max = numeros[i];
            }
            if(numeros[i] < min){
                min = numeros[i];
            }
        }
        System.out.println("Máximo=" + max);
        System.out.println("Mínimo=" + min);
    }
}