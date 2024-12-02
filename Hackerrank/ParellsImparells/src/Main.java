import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] sequencia = new int[n];

        for (int i = 0; i < n; i++) {
            sequencia[i] = scanner.nextInt();
        }

        int[] posicioParell = new int[n];
        int[] posicioImparell = new int[n];
        int[] valorParell = new int[n];
        int[] valorImparell = new int[n];

        int contPosicioParell = 0;
        int contPosicioImparell = 0;
        int contValorParell = 0;
        int contValorImparell = 0;

        for (int i = 0; i < n; i++) {
            if ((i + 1) % 2 == 0) {
                posicioParell[contPosicioParell++] = sequencia[i];
            } else {
                posicioImparell[contPosicioImparell++] = sequencia[i];
            }
        }


        for (int num : sequencia) {
            if (num % 2 == 0) {
                valorParell[contValorParell++] = num;
            } else {
                valorImparell[contValorImparell++] = num;
            }
        }

        imprimirArray(posicioParell, contPosicioParell);
        imprimirArray(posicioImparell, contPosicioImparell);

        System.out.println();

        imprimirArray(valorParell, contValorParell);
        imprimirArray(valorImparell, contValorImparell);

        scanner.close();
    }

    private static void imprimirArray(int[] array, int tamanyo) {
        for (int i = 0; i < tamanyo; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}