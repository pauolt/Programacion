import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] alfa = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] text = scanner.nextLine().toCharArray();
        Boolean tieneTodas = true;

        for (int i = 0; i < alfa.length; i++){
            boolean tieneLetra = false;
            for (int j = 0; j < text.length; j++){
                if(alfa[i] == text[j]){
                    tieneLetra = true;
                }
            }
            if (!tieneLetra) {
                tieneTodas = false;
            }
        }
        System.out.println(tieneTodas);
    }
}