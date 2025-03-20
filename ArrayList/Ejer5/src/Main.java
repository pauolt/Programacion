import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>(List.of("Buffer", "Encriptación", "Gateway", "Compilador", "Debugging", "Hardware", "Framework", "Iteración", "Java", "Algoritmo"));
        List<String> nueva = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String filtro = "";

        while(true) {

            nueva.clear();

            for (String word : lista) {
                if (word.contains(filtro)){
                    nueva.add(word);
                }
            }

            for (String word : nueva){
                System.out.println(word);
            }

            System.out.println("Tamaño de la lista: " + nueva.size());

            System.out.println("Filtro:");
            filtro = scanner.nextLine();

        }




    }

}