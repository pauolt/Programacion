class Clima {
    String name;
    int temperatura;
    Clima (String name, int temperatura) {
        this.name = name;
        this.temperatura = temperatura;
    }
}
class Habitat {
    String name;
    Clima clima;
    Boolean esNatural;
    Habitat (String name, Clima clima, boolean esNatural) {
        this.name = name;
        this.clima = clima;
        this.esNatural = esNatural;
    }
}
class Animal {
    String name;
    Habitat habitat;
    Animal (String name, Habitat habitat) {
        this.name = name;
        this.habitat = habitat;
    }
}
public class Animales {
    public static void main(String[] args) {
        Habitat habitat = new Habitat("Selva", new Clima("Calido", 30), true);
        Animal animal = new Animal("Tigre", habitat);
        System.out.println(animal.name);                 // Tigre
        System.out.println(animal.habitat.name);         // Selva
        System.out.println(animal.habitat.clima.name);   // Cálido
        System.out.println(animal.habitat.clima.temperatura); // 30
        System.out.println(animal.habitat.esNatural);    // true
    }
}
