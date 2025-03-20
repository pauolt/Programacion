import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            numeros.add(i);
        }

        numeros.removeIf(i -> i % 2 == 0);

        System.out.println(numeros);

    }
}