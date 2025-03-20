import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numeros.add(random.nextInt());
        }

        numeros.sort((a,b) -> {
            if (a > b){
                return -1;
            }
            return 1;
        });
        System.out.println(numeros);

    }
}