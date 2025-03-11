 import java.util.Random;

class Alumno {
     String nombre, apellido1, apellido2;
     String email;
     static String dominio = "@alu.edu.gva.es";

    Alumno(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = Alumno.generarEmail(nombre, apellido1, apellido2);
    }

    static String generarEmail (String nombre, String apellido1, String apellido2){
        return (nombre.substring(0,3) + apellido1.substring(0,3) + apellido2.substring(0,3) + generarNumeroAleatorio(100, 1000) + dominio).toLowerCase();
    }

    static int generarNumeroAleatorio(int min, int max){
        return new Random().nextInt(min, max);
    }

    public String toString() {
        return nombre + " : " + apellido1 + " : " + apellido2 + " : " + email;
    }
}

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Gerard", "Falco", "Perez");

        System.out.println(alumno1);

        Alumno.dominio = "@gmail.com";
        Alumno alumno2 = new Alumno("Pepe", "Falco", "Perez");


        System.out.println(alumno1);
        System.out.println(alumno2);

    }
}