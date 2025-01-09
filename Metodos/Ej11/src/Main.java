import java.time.LocalDate;

public class Main {

    public static boolean isXMAS(){
        boolean XMAS = false;
        if ((LocalDate.now().getMonth().getValue() == 12  && LocalDate.now().getDayOfMonth() >= 25 ) || (LocalDate.now().getMonth().getValue() == 1 && LocalDate.now().getDayOfMonth() <= 6) ){
            XMAS = true;
        }
        return XMAS;
    }
    public static void main(String[] args) {
        if (isXMAS()){
            System.out.println("🎄");
        } else {
            System.out.println("NO");
        }
    }
}