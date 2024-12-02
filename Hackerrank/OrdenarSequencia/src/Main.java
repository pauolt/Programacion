import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int tam = scanner.nextInt();
        int [] prueba = new int[tam];

        for (int i = 0; i < tam; i++){
            prueba[i] = scanner.nextInt();
        }
        boolean desordenado = true;
        while(desordenado) {
            desordenado = false;
            for (int i = 0; i < prueba.length - 1; i++) {
                if (prueba[0] > prueba[i + 1]) {
                    desordenado = true;
                    int aux = prueba[i + 1];
                    prueba[i + 1] = prueba[i];
                    prueba[i] = aux;
                }
            }
        }

        for (int i = 0; i < prueba.length; i++){
            System.out.print(prueba[i] + " ");
        }

    }
}