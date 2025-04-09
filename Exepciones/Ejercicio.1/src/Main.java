import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Ejercicio1{
    static int dividir(int a, int b) throws Exception{
        if (b == 0){
            throw new Exception();
        }
        return a/b;
    }



    static void pruebaDivision() {
        try {
            dividir(2, 6);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

class Ejercicio2{
    static void verificarEdad(int edad) throws Exception{
        if (edad < 18){
            throw new Exception();
        }
    }


    static void verificarNombre(String nombre) throws Exception {
        if (nombre.length() < 2){
            throw new Exception();
        }
    }


    static void comprobarCliente(String nombre, int edad) throws Exception{
        verificarEdad(edad);
        verificarNombre(nombre);
    }

}

class Ejercicio3 {
    static void buscar(String[] array, String valor) throws Exception{
        boolean en = false;
        for (String s : array){
            if (s.equals(valor)) {
                en = true;
                break;
            }
        }
        if (!en){
            throw new Exception();
        }
    }


    static void testBusqueda() {
        String[] array = {"azul", "rojo", "amarillo", "morado", "verde"};
        try {
            buscar(array, "verde");
        } catch (Exception e) {
            System.out.println("No se ha encontrado el valor");
        }
    }

}

class Ejercicio4 {
    static void validarPassword(String pass) throws Exception {
        if (pass.length() < 8){
            throw new Exception();
        }
    }


    static void registrarUsuario(String pass) {
        try {
            validarPassword(pass);
        } catch (Exception e) {
            System.out.println("La contraseña es demasiado pequeña");
        }
    }

}

class MyScanner {
    static void comprobarTexto(String texto) throws Exception {
        if (texto.isBlank()) {
            throw new Exception();
        }
    }

    static String leerTexto() {
        Scanner scanner = new Scanner(System.in);


        while (true) {

            String texto = scanner.nextLine();
            try {
                comprobarTexto(texto);
            } catch (Exception e) {
                System.out.println("Error");
            }
            return texto;
        }
    }
}

class Cliente {
    String nombre;
    int edad;

    Cliente(String nombre, int edad) throws ExceptionMenorEdad, ExceptionNombreInvalido{
            this.nombre = verificarNombre(nombre);
            this.edad = verificarEdad(edad);
    }


    int verificarEdad(int edad) throws ExceptionMenorEdad {
        if (edad < 18) {
            throw new ExceptionMenorEdad();
        }
        return edad;
    }

    String verificarNombre(String nombre) throws ExceptionNombreInvalido {
        if (nombre.length() < 2) {
            throw new ExceptionNombreInvalido();
        }
        return nombre;
    }

    @Override
    public String toString() { return nombre + ':' + edad; }
}
class ExceptionNombreInvalido extends Exception {}
class ExceptionMenorEdad extends Exception {}

class Producto {
    String nombre;
    double precio;
    String codigo;

    Producto(String nombre, double precio, String codigo) throws ExceptionNombreInvalido, PrecioNegativoException, CodigoDifException {
        this.nombre = verificarNombre(nombre);
        this.precio = verificarPrecio(precio);
        this.codigo = verificarCodigo(codigo);
    }

    String verificarNombre (String nombre) throws ExceptionNombreInvalido {
        if (nombre.isBlank()) throw new ExceptionNombreInvalido();
        return nombre;
    }

    double verificarPrecio (double precio) throws PrecioNegativoException {
        if (precio < 0) throw new PrecioNegativoException();
        return precio;
    }

    String verificarCodigo (String codigo) throws CodigoDifException {
        if (codigo.length() != 9) throw new CodigoDifException();
        return codigo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | " + "Precio: " + precio + " | " + "Codigo: " + codigo;
    }
}

class PrecioNegativoException extends Exception {}
class CodigoDifException extends Exception {}


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        /*
        Ejercicio1.pruebaDivision();
        try {
            Ejercicio2.comprobarCliente(scanner.next(), scanner.nextInt());
        } catch (Exception e) {
            System.out.println("Los datos no son validos");
        }
        Ejercicio3.testBusqueda();

        Ejercicio4.registrarUsuario(scanner.nextLine());

        //Ejercicio 5
        String texto = MyScanner.leerTexto();
        System.out.println(texto);

        //Ejercicio 6
        List<Cliente> clientes = new ArrayList<>();
        while (true) {
            try {
                clientes.add(new Cliente(scanner.next(), scanner.nextInt()));
                System.out.println("Cliente creado correctamente");
                System.out.println(clientes);
            } catch (ExceptionMenorEdad e) {
                System.out.println("Es menor de edad");
            } catch (ExceptionNombreInvalido e){
                System.out.println("Nombre demasiado corto");

            }
          }

        //Ejercicio 7
        List<Producto> productos = new ArrayList<>();
        while (true) {
            try {
                productos.add(new Producto(scanner.next(), scanner.nextDouble(), scanner.next()));
                System.out.println("Producto creado correctamente");
                System.out.println(productos);
            } catch (PrecioNegativoException e) {
                System.out.println("Precio negativo");
            } catch (ExceptionNombreInvalido e){
                System.out.println("Nombre demasiado corto");
            }catch (CodigoDifException e){
                System.out.println("Codigo no es de 9 digitos");
            }
        }

         */

    }
}