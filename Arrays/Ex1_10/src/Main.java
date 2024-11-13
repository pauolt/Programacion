import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float[] alturas = new float[n];
        float media = 0;
        float max = 0;
        float min = Float.MAX_VALUE;
        int cont = 0;
        for (int i = 0; i < alturas.length; i++){
            alturas[i] = scanner.nextFloat();
            media += alturas[i];
        }
        media = media/n;
        for (int i = 0; i < alturas.length; i++){
            if(alturas[i] > max){
                max = alturas[i];
            }
            if(alturas[i] < min){
                min = alturas[i];
            }
            if(alturas[i] < media){
                cont++;
            }
        }
        System.out.println("La media de altura es: " + media);
        System.out.println("Altura máxima: " + max);
        System.out.println("Altura mínima: " + min);
        System.out.println("Hay " + cont + " personas con una altura inferior a la media");
    }
}