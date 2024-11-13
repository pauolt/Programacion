import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean[] array = new boolean[20];
        int pos = 0;
        for (int i = 0; i < array.length; i++){
                pos = scanner.nextInt();
                if(pos == -1){
                    break;
                }
                array[pos] = true;

        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}