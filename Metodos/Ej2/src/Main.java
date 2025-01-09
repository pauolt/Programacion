public class Main {

    public static void saludarENG(){
        System.out.println("hello world");
    }

    public static void saludarESP(){
        System.out.println("hola mundo");
    }

    public static void saludar(){
        saludarESP();
        saludarENG();
    }


    public static void main(String[] args) {

        saludar();
    }
}