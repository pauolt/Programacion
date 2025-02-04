import java.io.IOException;
import java.nio.file.Path;
import java.util.Random;
import java.util.Scanner;

class Player {
    boolean[] categories = new boolean[6];

}

class Question {
    String category;
    String question;
    String A;
    String B;
    String C;
    String D;
    String corr;
    boolean wasAsked = false;

    Question(String category, String question, String A, String B, String C, String D, String corr){
        this.category = category;
        this.question = question;
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.corr = corr;


    }

    String getQuestion (){
        return category + "\n" + question + "\nA." + A + "\nB." + B + "\nC." + C + "\nD." + D;
    }



}

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Scanner fichero = new Scanner(Path.of("/home/pauolt2/IdeaProjects/Programacion/preguntas.txt"));
        Random random = new Random();

        System.out.println("Cuantos sois?");

        int n = scanner.nextInt();
        scanner.nextLine();

        Player[] players = new Player[n];

        for (int i = 0; i < players.length; i++){
                players[i] = new Player();
        }

        int nQuestions = fichero.nextInt();
        fichero.nextLine();
        Question[] questions = new Question[nQuestions];


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

        int player = 0;
        while(true){
            System.out.println("Jugador" + (player + 1));

            int nQuestion;
            while(true) {
                nQuestion = random.nextInt(nQuestions);
                if (!questions[nQuestion].wasAsked){
                    break;
                }
            }
            System.out.println(questions[nQuestion].getQuestion());
            String answer = scanner.nextLine();

            if (answer.equals(questions[nQuestion].corr)){
                System.out.println("CORRECTO!");
                System.out.println("Categoria " + questions[nQuestion].category + " superada!");

                int nCategory = switch (questions[nQuestion].category) {
                    case "Historia" -> 1;
                    case "Literatura" -> 2;
                    case "Deportes" -> 3;
                    case "Geografia" -> 4;
                    case "Arte" -> 5;
                    default -> 0;
                };
                players[player].categories[nCategory] = true;

            } else {
                System.out.println("Has fallado.");
            }

            questions[nQuestion].wasAsked = true;
            player = (player + 1) % n;

        }

    }
}