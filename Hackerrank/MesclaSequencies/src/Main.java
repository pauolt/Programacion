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
        int[] array2 = new int[n2];

        for (int i = 0; i < n2; i++){
            array2[i] = scanner.nextInt();
        }

        int masLargo = array1.length;
        if(array2.length > masLargo){
            masLargo = array2.length;
        }
        for (int i = 0; i < masLargo; i++){
            if(i < array1.length){
                System.out.print(array1[i] + " ");
            }
            if(i < array2.length){
                System.out.print( array2[i] + " ");
            }
        }
    }
}