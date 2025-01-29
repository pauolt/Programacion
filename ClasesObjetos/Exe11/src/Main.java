import java.util.Scanner;

class Libro {
    String titulo, autor;
    boolean disponible = true;

    Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;

    }

    boolean prestar() {
        if (disponible){
            disponible = false;
            return true;
        }
        return false;
    }

    boolean devolver() {
        if (!disponible){
            disponible = true;
            return true;
        }
        return false;
    }

    String getInfo() {
        return "Titulo: " + titulo + "| Autor: " + autor + "| Disponible: " + disponible;
    }

}


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Libro[] libros = new Libro[100];

        while(true) {

            System.out.println("""
               ✧✨✨✩BiblioApp✩✨✨✧
               ➊ ➕ Añadir Libro
               ➋ 📚 Ver libros
               ➌ 🗑 Eliminar libro
               ➍ 📤 Prestar libro
               ➎ 📥 Devolver libro
               ➏ 🖐 Salir
           """);


            String op = scanner.nextLine();


            switch (op) {
                case "1" -> {
                    System.out.print("Titulo: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();

                    for (int i = 0; i < libros.length; i++){
                        if (libros[i] == null){
                            libros[i] = new Libro(titulo, autor);
                            break;
                        }
                    }

                }


                case "2" -> {
                    System.out.println("Lista de libros");

                    for (int i = 0; i < libros.length; i++){
                        if (libros[i] != null) {
                            System.out.println(libros[i].getInfo());
                        }
                    }
                }


                case "3" -> {
                    System.out.print("Número del libro a eliminar: ");
                    int n = scanner.nextInt();
                    for (int i = 0; i < libros.length; i++){
                        if (i == n-1){
                            libros[i] = null;
                        }
                    }
                }


                case "4" -> {
                    System.out.print("Número del libro a prestar: ");
                    int n = scanner.nextInt();
                    for (int i = 0; i < libros.length; i++){
                        if (i == n && libros[i] != null){
                            libros[i].prestar();
                        }
                    }
                }


                case "5" -> {
                    System.out.print("Número del libro a devolver: ");
                    int n = scanner.nextInt();
                    for (int i = 0; i < libros.length; i++){
                        if (i == n && libros[i] != null){
                            libros[i].devolver();
                        }
                    }
                }

                case "6" -> {
                    System.out.println("Good bye");
                    return;
                }
            }
        }
    }
}
