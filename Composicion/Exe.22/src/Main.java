class Motor {
    String tipo;
    int caballos;

    Motor (String tipo, int caballos) {
        this.tipo = tipo;
        this.caballos = caballos;
    }
}

class Coche {
    Motor motor;
    String marca;
    String modelo;

    Coche (String marca, String modelo, String tipo, int caballos) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor(tipo, caballos);
    }

    Coche (String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;

    }

    String getInfo() {
        return marca + " | " + modelo + " | " + motor.tipo + " | " + motor.caballos;

    }

}
public class Main {
    public static void main(String[] args) {
        Coche c1 = new Coche("Ferrari", "Italia", "V12", 700);
        System.out.println(c1.getInfo());

        Coche c2 = new Coche("Seat", "Panda", new Motor("I4", 130));
        System.out.println(c2.getInfo());


    }
}