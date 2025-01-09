public class Main {

    public static String[] getMenu(){
        String[] menu = {"Crear Usuario", "Eliminar Usuario", "Ver estadísticas", "Salir"};
        return menu;
    }

    public static void main(String[] args) {
        for (int i = 0; i < getMenu().length; i++){
            System.out.println(getMenu()[i]);
        }
    }
}