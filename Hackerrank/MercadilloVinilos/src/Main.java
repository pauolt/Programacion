import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] vinilos = new String[n];
        boolean col = false;
        String nuevo = "";
        for (int i = 0; i < n; i++){
            vinilos[i] = scanner.nextLine();
        }
        nuevo = scanner.nextLine();
        for (int i = 0; i < n; i++){
            if(vinilos[i].equals(nuevo)){
                col = true;
                break;
            }
        }
        System.out.println(col);
    }
}