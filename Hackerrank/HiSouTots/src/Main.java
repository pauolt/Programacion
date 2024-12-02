import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero_alumnos = scanner.nextInt();
        int[] alumnos = new int[numero_alumnos];
        boolean[] presentes = new boolean[numero_alumnos + 1];

        for (int i = 0; i < numero_alumnos; i++) {
            alumnos[i] = scanner.nextInt();
        }

        boolean todosPresentes = true;

        for (int i = 0; i < numero_alumnos; i++) {
            int numero = alumnos[i];

            if (numero < 1 || numero > numero_alumnos || presentes[numero]) {
                todosPresentes = false;
                break;
            }
            presentes[numero] = true;
        }

        for (int i = 1; i <= numero_alumnos; i++) {
            if (!presentes[i]) {
                todosPresentes = false;
                break;
            }
        }

        if (todosPresentes) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}