import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String letra = scanner.nextLine();
        int pos = -1;

        for (int i=0; i<text.length(); i++){
            if(text.charAt(i) == letra.charAt(0)){
                pos = i;
                break;
            }
        }
        System.out.println(pos);
    }
}