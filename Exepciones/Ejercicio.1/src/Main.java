import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {


        // Scanner para leer del teclado
        Scanner scanner = new Scanner(System.in);


        // Pedimos la ruta de un fichero al usuario
        System.out.println("Ruta del fichero:");
        String file = scanner.next();


        // Pedimos una palabra al usuario
        System.out.println("Palabra:");
        String word = scanner.next();


        try{
            // Abrimos el fichero para leer su contenido
            Scanner fileScanner = new Scanner(Path.of(file));

            // Mientras haya lineas en el fichero
            while(fileScanner.hasNextLine()){
                // Leemos la linea del fichero
                String line = fileScanner.nextLine();

                // Comprobamos si la linea contiene la palabra
                if (line.contains(word)) {
                    System.out.println(line);
                }
            }
        } catch (NoSuchFileException e){
            System.out.println("No se ha encontrado el archivo");
        } catch (AccessDeniedException e){
            System.out.println("Acceso denegado.");
        }

    }
}
