class Color {
    String name;
    String code;

    Color (String name, String code) {
        this.name = name;
        this.code = code;
    }
}

class Especie {
    String name;
    boolean esMitica;
    Color color;

    Especie (String name, boolean esMitica, Color color) {
        this.name = name;
        this.esMitica = esMitica;
        this.color = color;
    }

}
class Personaje {
    String name;
    Especie especie;

    Personaje (String name, Especie especie) {
        this.name = name;
        this.especie = especie;
    }

}

public class Personajes {
    public static void main(String[] args) {
        Color color = new Color("Gris", "#323232");
        Especie especie = new Especie("Hadron", true, color);
        Personaje personaje = new Personaje("Eldran", especie);

        System.out.println(personaje.name);                // Eldran
        System.out.println(personaje.especie.name);        // Hadron
        System.out.println(personaje.especie.color.name);  // Gris
        System.out.println(personaje.especie.color.code);  // #323232
        System.out.println(personaje.especie.esMitica);    // true
    }
}