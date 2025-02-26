abstract class Notificacion{
    String destinatario, contenido;

    Notificacion(String destinatario, String contenido){
        this.destinatario = destinatario;
        this.contenido = contenido;
    }

    abstract String enviar();
}

class SMS extends Notificacion{

    SMS(String destinatario, String contenido){
        super(destinatario, contenido);
    }

    @Override
    String enviar() {
        return "Enviando SMS a: " + destinatario + " = " + contenido;
    }
}

class Email extends Notificacion{

    Email(String destinatario, String contenido){
        super(destinatario, contenido);
    }

    @Override
    String enviar() {
        return "Enviando email a " + destinatario + " = " + contenido;
    }
}

class Push extends Notificacion{

    Push(String destinatario, String contenido){
        super(destinatario, contenido);
    }

    @Override
    String enviar() {
        return "Enviando notificacion push a " + destinatario + " = " + contenido;
    }
}

class NotificacionManager {
    Notificacion[] array_notis = new Notificacion[100];

    void encolarNotificacion(Notificacion notificacion){
        for (int i = 0; i < array_notis.length; i++){
            if (array_notis[i] == null){
                array_notis[i] = notificacion;
                break;
            }
        }

    }

    void enviarTodas(){
        for (int i = 0; i < array_notis.length; i++){
            if (array_notis[i] != null){
                array_notis[i].enviar();
                array_notis[i] = null;
            }
        }
    }

}


public class Main {
    public static void main(String[] args) {

    }
}