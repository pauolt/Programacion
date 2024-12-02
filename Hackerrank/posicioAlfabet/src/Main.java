import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] alfabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for (int i = 0; i < text.length(); i++){
            if(Character.isLetter( text.charAt(i))){
                for (int j = 0; j < alfabet.length; j++){
                    if (alfabet[j] ==  text.charAt(i)){
                        System.out.println(j);
                        break;
                    }
                }
            }
        }
    }
}
