import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> wordCount = new HashMap<>();

        while (true){
            String word = scanner.nextLine().toLowerCase();

            if (word.isBlank()) break;


            wordCount.compute(word, (k, v) -> {
                if (v == null){
                    return 1;
                }

                return v + 1;
            });
        }

        wordCount.forEach((k,v) -> System.out.println(k + ": " + v));

    }
}