import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        int pos = 0;
        int neg = 0;
        for (int i=0; i<numeros.length; i++){
            numeros[i] = scanner.nextInt();
        }
        for (int i=0; i<numeros.length; i++){
            if(numeros[i] > 0){
                pos += numeros[i];
            }
            if(numeros[i] < 0){
                neg += numeros[i];
            }
        }
        System.out.println(pos);
        System.out.println(neg);
    }
}