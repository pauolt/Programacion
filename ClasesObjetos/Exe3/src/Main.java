class power_card {
    String name;
    String type;
    int points;

    power_card(String name, String type, int points){
        this.name = name;
        this.type = type;
        this.points = points;

    }
}
class player_card {
    String name;
    int health;
    String special;

    player_card(String name, int health, String special){
        this.name = name;
        this.health = health;
        this.special = special;

    }
}
public class Main {


    public static void main(String[] args) {

        power_card power1 = new power_card("Fuego Ardiente", "Hechizo", 30);
        power_card power2 = new power_card("Escudo Protector", "Defensa", 10);
        power_card power3 = new power_card("Rayo Relampagueante", "Ataque", 40);

        player_card player1 = new player_card("Guerrero", 100, "Ataque Fuerte");
        player_card player2 = new player_card("Mago", 80, "Invocar Criaturas");

        System.out.println("Poderes:");
        System.out.println("- " + "Nombre: " + power1.name + ", " + "Tipo: " + power1.name + ", " + "Puntos de Poder: " + power1.points);
        System.out.println("- " + "Nombre: " + power2.name + ", " + "Tipo: " + power2.name + ", " + "Puntos de Poder: " + power2.points);
        System.out.println("- " + "Nombre: " + power3.name + ", " + "Tipo: " + power3.name + ", " + "Puntos de Poder: " + power3.points);
        System.out.println();
        System.out.println("Personajes:");
        System.out.println("- " + "Nombre: " + player1.name + ", " + "Salud Inicial: " + player1.health + ", " + "Habilidad Especial: " + player1.special);
        System.out.println("- " + "Nombre: " + player2.name + ", " + "Salud Inicial: " + player2.health + ", " + "Habilidad Especial: " + player2.special);

    }
}