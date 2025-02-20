class Habitacion {
    int numero;
    String tipo;

    Habitacion (int numero, String tipo){
        this.numero = numero;
        this.tipo = tipo;
    }
}

class Hotel {
    String name;
    Habitacion habitacion;

}
class Cliente {
    String name;

}
class Reserva {
    Cliente cliente;
    Hotel hotel;

}
public class Reservas {
    public static void main(String[] args) {

        Reserva reserva = new Reserva();
        System.out.println(reserva.cliente.name);         // Ana
        System.out.println(reserva.hotel.name);           // Grand Palace
        System.out.println(reserva.hotel.habitacion.numero); // 203
        System.out.println(reserva.hotel.habitacion.tipo); // Doble


    }
}
