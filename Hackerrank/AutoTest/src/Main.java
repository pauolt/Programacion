import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] correctas = {"a", "b", "a", "c", "a", "b", "b", "c", "b", "c", "a", "c", "b", "a", "a", "a", "c", "c", "b", "a", "c", "b", "c", "c", "a", "a", "c", "a", "a", "c"
        };
        String[] usuario = new String[30];

        for (int i = 0; i < usuario.length; i++){
            usuario[i] = scanner.next();
        }

        int contador = 0;
        String[] fallos = new String[30];
        for (int i = 0; i < fallos.length; i++){
            if (usuario[i].equals(correctas[i])){
                fallos[i] = " ";
            }else {
                fallos[i] = correctas[i];
            }
        }

        for (int i = 0; i < usuario.length; i++){
            if (!usuario[i].equals(correctas[i])){
                contador++;
            }
        }

        if (contador > 3){
            System.out.println("TEST SUSPENDIDO");
        } else {
            System.out.println("TEST APROBADO");
        }
        System.out.println(contador + " fallos.");
        System.out.print(" ");
        for (int i = 1; i <= 30; i++){
            if(i < 9){
                System.out.print(i + "  ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print(" ");
        for (int i = 0; i < usuario.length; i++){
            System.out.print(usuario[i] + "  ");
        }
        System.out.println();
        System.out.print(" ");
        for (int i = 0; i < usuario.length; i++){
            System.out.print(fallos[i] + "  ");
        }
    }
}