import java.util.Random;

public class Main {

    public static int printRandom(){
        Random random = new Random();
        return random.nextInt(11);
    }

    public static void main(String[] args) {

        System.out.println(printRandom());
    }
}