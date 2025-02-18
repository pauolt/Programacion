class Pantalla {
    String tam;
    String resolucion;

    Pantalla(String  tam, String resolucion) {
        this.tam = tam;
        this. resolucion = resolucion;
    }

}

class Procesador {
    String modelo;
    String frecuencia;

    Procesador(String modelo, String frecuencia) {
        this.modelo = modelo;
        this.frecuencia = frecuencia;
    }

}


class Ordenador {
    Pantalla pantalla;
    Procesador procesador;

    Ordenador (String tam, String resolucion, String modelo, String frecuencia) {
        this.pantalla = new Pantalla(tam, resolucion);
        this.procesador = new Procesador(modelo, frecuencia);
    }

    Ordenador (Pantalla pantalla, Procesador procesador) {
        this.pantalla = pantalla;
        this.procesador = procesador;
    }

    String getInfo (){
        return pantalla.tam + " | " + pantalla.resolucion +  " | " + procesador.modelo +  " | " + procesador.frecuencia;
    }


}


public class Main {
    public static void main(String[] args) {

        Ordenador ordenador = new Ordenador("32''", "240x300", "i7", "20");
        Ordenador ordenador1 = new Ordenador(new Pantalla("32''", "240x300"), new Procesador("i7", "2G"));

        System.out.println(ordenador.getInfo());
        System.out.println(ordenador1.getInfo());
    }
}