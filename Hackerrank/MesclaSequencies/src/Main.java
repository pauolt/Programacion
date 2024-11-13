import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];

        for (int i = 0; i < n1; i++){
            array1[i] = scanner.nextInt();
        }

        int n2 = scanner.nextInt();
        int[] array2 = new int[n1];

        for (int i = 0; i < n2; i++){
            array2[i] = scanner.nextInt();
        }

        int tam = n1+n2;
        int[] array3 = new int[tam];

        for (int i = 0; i < n1; i++){
            array3[i] = array1[i];
            array3[i+1] = array2[i];
        }

        for (int i = 0; i < array3.length; i++){
            System.out.println(array3[i]);
        }

    }
}