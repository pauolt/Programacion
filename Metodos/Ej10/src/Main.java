import java.util.Random;

public class Main {

    public static int getRandomNum(){
        Random random = new Random();
        return random.nextInt(1,7);

    }

    public static void printDice(){
        String dice = "";
        if (getRandomNum() == 1){
            System.out.println("⚀");
        }
        if (getRandomNum() == 2){
            System.out.println("⚁");
        }
        if (getRandomNum() == 3){
            System.out.println("⚂");
        }
        if (getRandomNum() == 4){
            System.out.println("⚃");
        }
        if (getRandomNum() == 5){
            System.out.println("⚄");
        }
        if (getRandomNum() == 6){
            System.out.println("⚅");
        }
    }
    public static void main(String[] args) {
        System.out.println(getRandomNum());
        printDice();
    }
}