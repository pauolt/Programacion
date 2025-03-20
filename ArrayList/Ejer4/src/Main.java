import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>(List.of("Buffer", "Encriptación", "Gateway", "Compilador", "Debugging", "Hardware", "Framework", "Iteración", "Java", "Algoritmo"));

        lista.sort( (a, b) -> {
            if (a.charAt(0) > b.charAt(0)) {
                return 1;
            }
            return -1;
        } );

        for (String s : lista){
            System.out.print(s + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el filtro");
        String filtro = scanner.nextLine();

        lista.removeIf(s -> !s.contains(filtro));

        lista.sort( (a, b) -> {
            if (a.charAt(0) > b.charAt(0)) {
                return 1;
            }
            return -1;
        } );

        for (String s: lista){
            System.out.print(s + " ");
        }



    }
}