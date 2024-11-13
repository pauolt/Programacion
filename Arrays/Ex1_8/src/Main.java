import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        float[] numeros = new float[100];
        float r = 0;
        int may = 0;
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = random.nextFloat(0.0f, 1.0f);;
        }
        r = scanner.nextFloat();
        for (int i = 0; i < numeros.length; i++){
            if(numeros[i] >= r){
                may++;
            }
        }
        System.out.println(may);
    }
}