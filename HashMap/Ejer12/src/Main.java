import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> tablaPuntos = new HashMap<>();

        while (true) {
            String nombre = scanner.nextLine();
            int puntos = scanner.nextInt(); scanner.nextLine();

            tablaPuntos.put(nombre, puntos);

            for (var j : tablaPuntos.entrySet()){
                System.out.println(j.getKey() + " : " + j.getValue());
            }

        }



    }
}