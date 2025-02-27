import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Scanner;

class SafeScanner {
    interface BadWordAction {
        void action(String badWord) throws Exception;
    }


    Scanner scanner = new Scanner(System.in);
    String[] badWords = {"caca", "culo", "pedo", "pis"};
    BadWordAction badWordAction;


    void setBadWordAction(BadWordAction badWordAction) {
        this.badWordAction = badWordAction;
    }


    String nextLine() throws Exception {
        String line = scanner.nextLine();


        for (int i = 0; i < badWords.length; i++) {
            if (line.contains(badWords[i])) {
                if ( badWordAction != null)
                    badWordAction.action(badWords[i]);
                return "censored";
            }
        }
        return line;
    }
}

class ReportarPalabrota implements SafeScanner.BadWordAction{
    @Override
    public void action(String badWord) throws Exception {
        Files.writeString(Path.of("registro.log"), badWord + ":" + LocalDate.now());
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        SafeScanner safeScanner = new SafeScanner();

        safeScanner.setBadWordAction(new ReportarPalabrota());
        while(true) {
            String linea = safeScanner.nextLine();
            System.out.println(linea);
        }

    }
}
