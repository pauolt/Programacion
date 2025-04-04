import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 3 7
// 5 8
record Reserva (int hora_inicio, int hora_final, String nombreCliente){}

class GestionDeReservas {
    Map<Integer, List<Reserva>> reservas = new HashMap<>();

    boolean reservar (int habitacion, int inicio, int fin, String cliente){

        reservas.putIfAbsent(habitacion, new ArrayList<>());
        for (Reserva res : reservas.get(habitacion) ) {
            if (res.hora_inicio() == inicio || inicio > res.hora_inicio() || fin > res.hora_inicio() || res.hora_final() == inicio) return false;
        }

        reservas.get(habitacion).add(new Reserva(inicio, fin, cliente));
        return true;
    }

    void liberar (int habitacion, int inicio){
        if (!reservas.containsKey(habitacion)) return;

        List<Reserva> listaReservas = reservas.get(habitacion);
        listaReservas.removeIf(reserva -> reserva.hora_inicio() == inicio);

        if (listaReservas.isEmpty()) reservas.remove(habitacion);
    }
}


public class Main {
    public static void main(String[] args) {
        GestionDeReservas gestionDeReservas = new GestionDeReservas();
        System.out.println(gestionDeReservas.reservar(101, 11, 13, "Juan")); //t
        System.out.println(gestionDeReservas.reservar(101, 11, 12, "Paco")); //f
        System.out.println(gestionDeReservas.reservar(101, 12, 13, "Paco")); //f
        System.out.println(gestionDeReservas.reservar(101, 10, 12, "Paco")); //f
        System.out.println(gestionDeReservas.reservar(101, 12, 14, "Paco")); //f
        System.out.println(gestionDeReservas.reservar(101, 10, 11, "Paco")); //t
        System.out.println(gestionDeReservas.reservar(101, 13, 14, "Paco")); //t


    }
}