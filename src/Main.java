import java.io.IOException;
import java.nio.file.Path;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {

        //Pillar palabras de un archivo:
        Scanner fileScanner = new Scanner(Path.of("file"));

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] dict = new String[4752];

        //Colores
        String cError = "\033[31;107m";
        String cReset = "\033[0m";
        String cVerde = "\033[97;42m";
        String cAmarillo = "\033[97;43m";
        String cGris = "\033[0;37m";

        for (int i = 0; i < dict.length; i++){
            dict[i] = fileScanner.nextLine();
        }

        int wordIndex = random.nextInt(dict.length);

        String word = dict[wordIndex];
        System.out.println(word);

        for (int tries = 10; tries >= 1; tries--) {
            System.out.println("Tries: " + tries);
            String guest = scanner.nextLine();

            while (guest.length() != 5){
                System.out.println(cError + "Palabra no valida." + cReset);
                guest = scanner.nextLine();
            }

            for (int i = 0; i < guest.length(); i++) {
                if (guest.charAt(i) == word.charAt(i)){
                    System.out.print(cVerde + guest.charAt(i) + cReset);
                } else if (word.indexOf(guest.charAt(i)) != -1){
                    System.out.print(cAmarillo + guest.charAt(i) + cReset);
                } else {
                    System.out.print(cGris + guest.charAt(i) + cReset);
                }
            }
            System.out.println();

        }


    }
}