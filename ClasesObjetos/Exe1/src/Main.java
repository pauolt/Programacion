public class Main {

    static class DriverData {
        String nombrePiloto;
        int numeroPiloto;
        String equipoPiloto;
        int podiosTotales;
        int posicionActualPilotoEnElMundial;

    }

    static class CircuitData {
        String nombreCircuito;
        int vueltasTotales;
        float tiempoVueltaRapida;
        int totalCarreras;

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
        String nombreTorneo;
        String paisOrganizador;
        int anioTorneo;
        String estadio;
        int espectadores;
        boolean partidoConcluido;
    }

    static class Team {
        int golesEquipo;
        String nombreEquipo;
        String entrenadorEquipo;
        int puntosEquipo;
    }


    static class WorldData {
        String nombreMundo;
        int numeroRegiones;
        boolean tieneCalabozos;
    }

    static class PlayerData {
        String nombrePersonaje;
        int salud;
        String armaPrincipal;
    }

    static class EnemyData {
        String nombreEnemigo;
        int saludEnemigo;
        String armaEnemigo;
    }

    static class ObjectData {
        String nombreObjeto;
        String tipoObjeto;
        int cantidadEfecto;
    }

    public static void main(String[] args) {

        DriverData dd1 = new DriverData();
        CircuitData cd = new CircuitData();

        dd1.nombrePiloto = "Lewis Hamilton";
        dd1.numeroPiloto = 44;
        dd1.equipoPiloto = "Mercedes-AMG Petronas";
        dd1.podiosTotales = 191;
        dd1.posicionActualPilotoEnElMundial = 2;

        cd.nombreCircuito = "Circuit de Monaco";
        cd.vueltasTotales = 78;
        cd.tiempoVueltaRapida = 1.10f;
        cd.totalCarreras = 23;

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

        team1.golesEquipo = 2;
        team1.nombreEquipo = "Tigres Rojos";
        team1.entrenadorEquipo = "Carlos Martínez";
        team1.puntosEquipo = 3;

        team2.golesEquipo = 0;
        team2.nombreEquipo = "Águilas Azules";
        team2.entrenadorEquipo = "Ana López";
        team2.puntosEquipo = 0;

        td.nombreTorneo = "Copa Mundial";
        td.paisOrganizador = "España";
        td.anioTorneo = 2025;
        td.estadio = "Estadio Nacional";
        td.espectadores = 50000;
        td.partidoConcluido = true;

        WorldData wd = new WorldData();
        PlayerData pd = new PlayerData();
        EnemyData ed = new EnemyData();
        ObjectData od = new ObjectData();

        wd.nombreMundo = "Hyrule";
        wd.numeroRegiones = 5;
        wd.tieneCalabozos = true;

        pd.nombrePersonaje = "Link";
        pd.salud = 100;
        pd.armaPrincipal = "Espada Maestra";

        ed.nombreEnemigo = "Goblin";
        ed.saludEnemigo = 50;
        ed.armaEnemigo = "Porra";

        od.nombreObjeto = "Frasco de poción";
        od.tipoObjeto = "Curación";
        od.cantidadEfecto = 50;



        System.out.println("Piloto: " + dd1.nombrePiloto);
        System.out.println("Número: " + dd1.numeroPiloto);
        System.out.println("Equipo: " + dd1.equipoPiloto);
        System.out.println("Circuito: " + cd.nombreCircuito);
        System.out.println("Vueltas totales: " + cd.vueltasTotales);
        System.out.println("Tiempo vuelta rápida: " + cd.tiempoVueltaRapida + " min");
        System.out.println("Carreras en la temporada: " + cd.totalCarreras);
        System.out.println("Posición actual del piloto: " + dd1.posicionActualPilotoEnElMundial);

        System.out.println("Biblioteca: " + library.nombreBiblioteca);
        System.out.println("Dirección: " + library.direccionBiblioteca);
        System.out.println("Libros disponibles:");
        System.out.println("- " + book1.titulo + " (Autor: " + book1.autor + ", Año: " + book1.anioPublicacionLibro + ")");
        System.out.println("- " + book2.titulo + " (Autor: " + book2.autor + ", Año: " + book2.anioPublicacionLibro + ")");

        System.out.println("Torneo: " + td.nombreTorneo + " (" + td.anioTorneo + ")");
        System.out.println("Partido: " + team1.nombreEquipo + " vs. " + team2.nombreEquipo);
        System.out.println("Goles " + team1.nombreEquipo + ": " + team2.golesEquipo);
        System.out.println("Goles " + team1.nombreEquipo + ": " + team2.golesEquipo);
        System.out.println("Estadio: " + td.estadio + " (Espectadores: " + td.espectadores + ")");

        System.out.println("Mundo: " + wd.nombreMundo + " (Regiones: " + wd.numeroRegiones + ")");
        System.out.println("Personaje: " + pd.nombrePersonaje + " (Salud: " + pd.salud + ", Arma: " + pd.armaPrincipal + ")");
        System.out.println("Enemigo: " + ed.nombreEnemigo + " (Salud: " + ed.saludEnemigo + ", Arma: " + ed.armaEnemigo + ")");
        System.out.println("Objeto: " + od.nombreObjeto + " (Tipo: " + od.tipoObjeto + ", Efecto: +" + od.cantidadEfecto + " salud)");
    }
}
