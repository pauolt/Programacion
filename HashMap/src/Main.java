import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
        List<String> words = new ArrayList<>();
        List<Integer> count = new ArrayList<>();

        while(true){
            String w = scanner.nextLine().toLowerCase();

            if (w.isEmpty()){
                break;
            }

            int index = words.indexOf(w);

            if (index != -1) {
                count.set(index, count.get(index) + 1);
            } else {
                words.add(w);
                count.add(1);
            }

        }

        for (int i = 0; i < words.size(); i++){
            System.out.println(words.get(i) + ": " +count.get(i));

        }


*/
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