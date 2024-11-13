import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean igual = false;

        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];

        for (int i = 0; i < n1; i++){
            array1[i] = scanner.nextInt();
        }

        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];

        for (int i = 0; i < n2; i++){
            array2[i] = scanner.nextInt();
        }

        if(n1 == n2){
            for (int i = 0; i < n1; i++){
                igual = array1[i] == array2[i];
            }
        }
        System.out.println(igual);

    }
}