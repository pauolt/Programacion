import java.util.Scanner;

public class Main {

    public static String[] getMenu(){
        String[] menu = {"Crear Usuario", "Eliminar Usuario", "Ver estadísticas", "Salir"};
        return menu;
    }

    public static String askMenu(){

        for (int i = 0; i < getMenu().length; i++){
            System.out.println(i+1 + " " + getMenu()[i]);
        }

        Scanner scanner = new Scanner(System.in);
        boolean found = false;
        String Option = " ";

        while(!found) {
            int selectOption = scanner.nextInt();
            for (int i = 0; i < getMenu().length; i++) {
                if (i == selectOption - 1) {
                    Option = getMenu()[i];
                    found = true;
                }
            }
        }
        return Option;
    }

    public static void main(String[] args) {
        System.out.println(askMenu());
    }
}