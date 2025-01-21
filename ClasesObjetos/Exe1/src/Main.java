public class Main {

    static class DriverData {
        String nombre;
        int numero;
        String equipo;
        int podiosTotales;
        int posicionActual;

    }

    static class CircuitData {
        String nombre;
        int vueltasTotales;
        float tiempoVueltaRapida;
        int totalCarreras;

    }

    static class Book {
        String titulo;
        String autor;
        int anioPublicacion;

    }

    static class Library {
        String nombre;
        String direccion;
    }

    static class Tourn {
        String nombre;
        String paisOrganizador;
        int anio;
        String estadio;
        int espectadores;
        boolean partidoConcluido;
    }

    static class Team {
        int goles;
        String nombre;
        String entrenador;
        int puntos;
    }


    static class WorldData {
        String nombre;
        int numeroRegiones;
        boolean tieneCalabozos;
    }

    static class PlayerData {
        String nombre;
        int salud;
        String armaPrincipal;
    }

    static class EnemyData {
        String nombre;
        int salud;
        String arma;
    }

    static class ObjectData {
        String nombre;
        String tipo;
        int cantidadEfecto;
    }

    public static void main(String[] args) {

        DriverData driver1 = new DriverData();
        CircuitData circuit = new CircuitData();

        driver1.nombre = "Lewis Hamilton";
        driver1.numero = 44;
        driver1.equipo = "Mercedes-AMG Petronas";
        driver1.podiosTotales = 191;
        driver1.posicionActual = 2;

        circuit.nombre = "Circuit de Monaco";
        circuit.vueltasTotales = 78;
        circuit.tiempoVueltaRapida = 1.10f;
        circuit.totalCarreras = 23;

        Book book1 = new Book();
        Book book2 = new Book();
        Library library = new Library();

        book2.autor = "George Orwell";
        book2.titulo = "1984";
        book2.anioPublicacion = 1949;
        book1.autor = "Gabriel García Márquez";
        book1.titulo = "Cien años de soledad";
        book1.anioPublicacion = 1967;
        library.nombre = "Biblioteca Central";
        library.direccion = "Calle Principal, 123";

        Team team1 = new Team();
        Team team2 = new Team();
        Tourn tourn = new Tourn();

        team1.goles = 2;
        team1.nombre = "Tigres Rojos";
        team1.entrenador = "Carlos Martínez";
        team1.puntos = 3;

        team2.goles = 0;
        team2.nombre = "Águilas Azules";
        team2.entrenador = "Ana López";
        team2.puntos = 0;

        tourn.nombre = "Copa Mundial";
        tourn.paisOrganizador = "España";
        tourn.anio = 2025;
        tourn.estadio = "Estadio Nacional";
        tourn.espectadores = 50000;
        tourn.partidoConcluido = true;

        WorldData world = new WorldData();
        PlayerData player = new PlayerData();
        EnemyData enemy = new EnemyData();
        ObjectData object = new ObjectData();

        world.nombre = "Hyrule";
        world.numeroRegiones = 5;
        world.tieneCalabozos = true;

        player.nombre = "Link";
        player.salud = 100;
        player.armaPrincipal = "Espada Maestra";

        enemy.nombre = "Goblin";
        enemy.salud = 50;
        enemy.arma = "Porra";

        object.nombre = "Frasco de poción";
        object.tipo = "Curación";
        object.cantidadEfecto = 50;



        System.out.println("Piloto: " + driver1.nombre);
        System.out.println("Número: " + driver1.numero);
        System.out.println("Equipo: " + driver1.equipo);
        System.out.println("Circuito: " + circuit.nombre);
        System.out.println("Vueltas totales: " + circuit.vueltasTotales);
        System.out.println("Tiempo vuelta rápida: " + circuit.tiempoVueltaRapida + " min");
        System.out.println("Carreras en la temporada: " + circuit.totalCarreras);
        System.out.println("Posición actual del piloto: " + driver1.posicionActual);

        System.out.println("Biblioteca: " + library.nombre);
        System.out.println("Dirección: " + library.direccion);
        System.out.println("Libros disponibles:");
        System.out.println("- " + book1.titulo + " (Autor: " + book1.autor + ", Año: " + book1.anioPublicacion + ")");
        System.out.println("- " + book2.titulo + " (Autor: " + book2.autor + ", Año: " + book2.anioPublicacion + ")");

        System.out.println("Torneo: " + tourn.nombre + " (" + tourn.anio + ")");
        System.out.println("Partido: " + team1.nombre + " vs. " + team2.nombre);
        System.out.println("Goles " + team1.nombre + ": " + team2.goles);
        System.out.println("Goles " + team1.nombre + ": " + team2.goles);
        System.out.println("Estadio: " + tourn.estadio + " (Espectadores: " + tourn.espectadores + ")");

        System.out.println("Mundo: " + world.nombre + " (Regiones: " + world.numeroRegiones + ")");
        System.out.println("Personaje: " + player.nombre + " (Salud: " + player.salud + ", Arma: " + player.armaPrincipal + ")");
        System.out.println("Enemigo: " + enemy.nombre + " (Salud: " + enemy.salud + ", Arma: " + enemy.arma + ")");
        System.out.println("Objeto: " + object.nombre + " (Tipo: " + object.tipo + ", Efecto: +" + object.cantidadEfecto + " salud)");
    }
}
