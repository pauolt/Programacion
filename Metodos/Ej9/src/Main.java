import java.time.LocalDate;

public class Main {

    public static int printNumDay(){
        return LocalDate.now().getDayOfWeek().getValue();

    }
    public static void main(String[] args) {

        System.out.println(printNumDay());
    }
}