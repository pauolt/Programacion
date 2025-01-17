public class Main {

    static class DriverData {
        String nombrePiloto = "Lewis Hamilton";
        int numeroPiloto = 44;
        String equipoPiloto = "Mercedes-AMG Petronas";
        int podiosTotales = 191;
        int posicionActualPilotoEnElMundial = 2;

    }

    static class CircuitData {
        String nombreCircuito = "Circuit de Monaco";
        int vueltasTotales = 78;
        float tiempoVueltaRapida = 1.10f;
        int totalCarreras = 23;

    }

    static class Book {
        String titulo;
        String autor;
        int anioPublicacionLibro;

    }

    static class Library {
        String nombreBiblioteca;
        String direccionBiblioteca;
    }

    static class Tourn {
        String nombreTorneo = "Copa Mundial";
        String paisOrganizador = "España";
        int anioTorneo = 2025;
        String estadio = "Estadio Nacional";
        int espectadores = 50000;
        boolean partidoConcluido = true;
    }

    static class Team {
        int golesEquipo;
        String nombreEquipo;
        String entrenadorEquipo;
        int puntoEquipo;
    }

    static class Team1Data {
        int golesEquipo1 = 2;
        String nombreEquipo1 = "Tigres Rojos";
        String entrenadorEquipo1 = "Carlos Martínez";
        int puntosEquipo1 = 3;
    }

    static class Team2Data {
        int golesEquipo2 = 0;
        String nombreEquipo2 = "Águilas Azules";
        String entrenadorEquipo2 = "Ana López";
        int puntosEquipo2 = 0;
    }

    static class WorldData {
        String nombreMundo = "Hyrule";
        int numeroRegiones = 5;
        boolean tieneCalabozos = true;
    }

    static class PlayerData {
        String nombrePersonaje = "Link";
        int salud = 100;
        String armaPrincipal = "Espada Maestra";
    }

    static class EnemyData {
        String nombreEnemigo = "Goblin";
        int saludEnemigo = 50;
        String armaEnemigo = "Porra";
    }

    static class ObjectData {
        String nombreObjeto = "Frasco de poción";
        String tipoObjeto = "Curación";
        int cantidadEfecto = 50;
    }

    public static void main(String[] args) {

        DriverData dd = new DriverData();
        CircuitData cd = new CircuitData();
        Book book1 = new Book();
        Book book2 = new Book();
        Library library = new Library();

        book2.autor = "George Orwell";
        book2.titulo = "1984";
        book2.anioPublicacionLibro = 1949;
        book1.autor = "Gabriel García Márquez";
        book1.titulo = "Cien años de soledad";
        book1.anioPublicacionLibro = 1967;
        library.nombreBiblioteca = "Biblioteca Central";
        library.direccionBiblioteca = "Calle Principal, 123";

        Team team1 = new Team();
        Team team2 = new Team();
        Tourn td = new Tourn();

        WorldData wd = new WorldData();
        PlayerData pd = new PlayerData();
        EnemyData ed = new EnemyData();
        ObjectData od = new ObjectData();

        System.out.println("Piloto: " + dd.nombrePiloto);
        System.out.println("Número: " + dd.numeroPiloto);
        System.out.println("Equipo: " + dd.equipoPiloto);
        System.out.println("Circuito: " + cd.nombreCircuito);
        System.out.println("Vueltas totales: " + cd.vueltasTotales);
        System.out.println("Tiempo vuelta rápida: " + cd.tiempoVueltaRapida + " min");
        System.out.println("Carreras en la temporada: " + cd.totalCarreras);
        System.out.println("Posición actual del piloto: " + dd.posicionActualPilotoEnElMundial);

        System.out.println("Biblioteca: " + library.nombreBiblioteca);
        System.out.println("Dirección: " + library.direccionBiblioteca);
        System.out.println("Libros disponibles:");
        System.out.println("- " + book1.titulo + " (Autor: " + book1.autor + ", Año: " + book1.anioPublicacionLibro + ")");
        System.out.println("- " + book2.titulo + " (Autor: " + book2.autor + ", Año: " + book2.anioPublicacionLibro + ")");

        System.out.println("Torneo: " + td.nombreTorneo + " (" + td.anioTorneo + ")");
        System.out.println("Partido: " + t1d.nombreEquipo1 + " vs. " + t2d.nombreEquipo2);
        System.out.println("Goles " + t1d.nombreEquipo1 + ": " + t1d.golesEquipo1);
        System.out.println("Goles " + t2d.nombreEquipo2 + ": " + t2d.golesEquipo2);
        System.out.println("Estadio: " + td.estadio + " (Espectadores: " + td.espectadores + ")");

        System.out.println("Mundo: " + wd.nombreMundo + " (Regiones: " + wd.numeroRegiones + ")");
        System.out.println("Personaje: " + pd.nombrePersonaje + " (Salud: " + pd.salud + ", Arma: " + pd.armaPrincipal + ")");
        System.out.println("Enemigo: " + ed.nombreEnemigo + " (Salud: " + ed.saludEnemigo + ", Arma: " + ed.armaEnemigo + ")");
        System.out.println("Objeto: " + od.nombreObjeto + " (Tipo: " + od.tipoObjeto + ", Efecto: +" + od.cantidadEfecto + " salud)");
    }
}
