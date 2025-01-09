public class Main {

    public static String saludar(){
        return "hola mundo";
    }

    public static String addExclamaciones(){
        return saludar() + "!!!";

    }
    public static void main(String[] args) {

        System.out.println(addExclamaciones());
    }
}