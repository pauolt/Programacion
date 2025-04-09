import java.util.ArrayList;
import java.util.List;

record Alumno(String nombre){}

public class Main {
    public static void main(String[] args) {

        List<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(new Alumno("Paco"));
        listaAlumnos.add(new Alumno("Pepe"));
        listaAlumnos.addFirst(new Alumno("Juan"));

        System.out.println( listaAlumnos.size());
        System.out.println( listaAlumnos.isEmpty());

        Alumno retornado = listaAlumnos.set(1, new Alumno("Pau"));
        System.out.println(retornado);

        System.out.println();
        for (Alumno(String nombre) : listaAlumnos) {
            System.out.println(nombre);
        }


    }
}
