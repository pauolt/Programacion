import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>(List.of("hola", "adios", "quetal"));

        while (true) {

            for (int i = 0; i < words.size(); i++) {
                System.out.println(i + ") " + words.get(i));
            }

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            String aux = words.get(a);
            words.set(a, words.get(b));
            words.set(b, aux);


        }


    }
}