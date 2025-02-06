class Usuario {
    String nombreUsuario;
    int sesionesActivas = 0;
    static int sesionesTotales;

    Usuario(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
    }

    void iniciarSesion() {
        sesionesActivas++;
        sesionesTotales++;
    }

    void cerrarSesion() {
        sesionesActivas--;
        sesionesTotales--;
    }

    static int obtenerSesionesTotales() {
        return sesionesTotales;
    }
}

public class Main {
    public static void main(String[] args){
        Usuario u1 = new Usuario("BigPasta420");
        Usuario u2 = new Usuario("SmallPeste69");

        u1.iniciarSesion();
        u1.iniciarSesion();
        u1.iniciarSesion();
        u2.iniciarSesion();

        u1.cerrarSesion();

        System.out.println(u1.sesionesActivas);
        System.out.println(u2.sesionesActivas);
        System.out.println(Usuario.obtenerSesionesTotales());

        u2.cerrarSesion();

        System.out.println(Usuario.obtenerSesionesTotales());



    }
}