import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        Set<String> words = new HashSet<>();

        while (true) {
            System.out.println(
                    "1) Agregar palabra\n" +
                            "2) Verificar palabra\n" +
                            "3) Eliminar palabra\n" +
                            "4) Mostrar palabras\n" +
                            "5) Salir"
            );
            System.out.println("¿Qué quieres hacer?");
            int ans = scanner.nextInt();
            scanner.nextLine();

            if (ans == 1) {
                System.out.println("Introduce la palabra:");
                String word = scanner.nextLine();
                words.add(word);

            } else if (ans == 2) {
                System.out.println("Introduce la palabra a verificar:");
                String word = scanner.nextLine();

                if (words.contains(word)) {
                    System.out.println("La palabra está en la lista");

                } else {
                    System.out.println("La palabra no está en la lista");

                }
            } else if (ans == 3) {
                System.out.println("Introduce la palabra a eliminar:");
                String word = scanner.nextLine();

                if (words.remove(word)) {
                    System.out.println("Palabra eliminada.");

                } else {
                    System.out.println("La palabra no estaba en la lista.");

                }
            } else if (ans == 4) {
                if (words.isEmpty()) {
                    System.out.println("No hay palabras en la lista.");

                } else {
                    System.out.println("Palabras en la lista: " + String.join(", ", words));

                }
            } else if (ans == 5) {
                System.out.println("Saliendo...");
                break;

            } else {
                System.out.println("Opción no válida.");

            }
        }

    }
}
