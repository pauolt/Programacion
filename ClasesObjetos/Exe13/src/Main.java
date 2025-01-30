import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

class Player {
    boolean [] catGuessed = {false, false , false};

}

class Question {
    String category;
    String question;
    String A;
    String B;
    String C;
    String D;
    String corr;

    Question(String category, String question, String A, String B, String C, String D, String corr){
        this.category = category;
        this.question = question;
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.corr = corr;

    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Scanner fichero = new Scanner(Path.of("preguntas.txt"));

        System.out.println("Cuantos sois?");

        int n = scanner.nextInt();
        scanner.nextLine();

        Player[] players = new Player[n];

        for (int i = 0; i < players.length; i++){
                players[i] = new Player();
        }

        Question[] questions = new Question[fichero.nextInt()];

        for (int i = 0; i < questions.length; i++) {
            String question = fichero.nextLine();
            String a = fichero.nextLine();
            String b = fichero.nextLine();
            String c = fichero.nextLine();
            String d = fichero.nextLine();
            String correct = fichero.nextLine();
            String category = fichero.nextLine();

            questions[i] = new Question(category,question,a,b,c,d,correct);
        }

    }
}