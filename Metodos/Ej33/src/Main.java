import java.util.Scanner;

public class Main {

    public static String leftPad(String word, int l){
            if (l > word.length()){
                return  " ".repeat(l-word.length()) + word;
            }
            return word;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int l = scanner.nextInt();
        System.out.println(leftPad(word, l));

    }
}