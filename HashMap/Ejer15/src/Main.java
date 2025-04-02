import com.sun.source.tree.IfTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<String, String> agenda = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("""
                1. Agregar contacto
                2. Modificar contacto
                3. Eliminar contacto
                4. Buscar contacto por su nombre
                5. Mostrar todos los contactos
                """);

            int option = scanner.nextInt();
            scanner.nextLine();

            String name;
            String num;

            switch (option) {
                case 1:
                    System.out.println("Datos del contacto: ");
                    System.out.print("Nombre: ");
                    name = scanner.nextLine();
                    System.out.print("Número: ");
                    num = scanner.nextLine();
                    agenda.put(name, num);
                    System.out.println("Contacto " + name + " con número " + num + " agregado");
                    break;

                case 2:
                    System.out.println("Nombre del contacto a modificar: ");
                    name = scanner.nextLine();
                    System.out.println("Número nuevo: ");
                    num = scanner.nextLine();

                    agenda.compute(name, (k, v) -> {
                        if (v == null) {
                            System.out.println("Contacto no encontrado. ¿Desea añadirlo? (Y/N)");
                            String respuesta = scanner.next().toLowerCase();
                            if (respuesta.equals("y")) {
                                return num;
                            } else {
                                return null;
                            }
                        }
                        return num;
                    });
                    break;

                case 3:
                    System.out.println("Nombre del contacto a eliminar: ");
                    name = scanner.nextLine();
                    agenda.remove(name);
                    System.out.println("Contacto " + name + " eliminado");

                case 4:
                    System.out.println("Nombre del contacto a buscar: ");
                    name = scanner.nextLine();
                    System.out.println("Numero del contacto: " + agenda.get(name));

                case 5:
                    System.out.println("Contactos: ");
                    agenda.forEach((k, v) -> System.out.println(k + " : " + v));
            }
            System.out.println();
        }


    }
}