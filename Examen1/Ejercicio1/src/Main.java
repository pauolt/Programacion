import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float numero = 0f;
        float suma_total = 0;
        float media = 0;
        float mayor = 0;
        float menor = 9999999;
        float mayor_media = 0;
        float menor_media = 0;
        float[] numeros = new float[n];
        boolean igual_media = false;

        for (int i = 0; i < n; i++){
            numero = scanner.nextFloat();
            numeros[i] = numero;
            suma_total += numero;
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor){
                menor = numero;
            }
        }
        media = suma_total/n;

        for (int i = 0; i < n; i++){
            if (numeros[i] > media){
                mayor_media++;
            }
            if (numeros[i] < media){
                menor_media++;
            }
            if (numeros[i] == media){
                igual_media = true;
            }
        }

        System.out.println(n);
        System.out.println(suma_total);
        System.out.println(media);
        System.out.println(mayor);
        System.out.println(menor);
        System.out.println(menor_media*100/n + "%");
        System.out.println(mayor_media*100/n + "%");
        System.out.println(igual_media);

    }
}