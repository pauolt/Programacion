import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<>();
        colores.add("rojo");
        colores.add("azul");
        colores.add("verde");
        colores.add("morado");
        colores.add("amarillo");

        for (String s: colores){
            System.out.print(s + " ");
        }
        System.out.println();
        colores.set(1, "rosa");
        colores.removeLast();

        for (String s: colores){
            System.out.print(s + " ");
        }

    }
}