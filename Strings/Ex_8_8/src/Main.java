import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String c = "c:\\user\\john";
        String rem = c.replace('\\', '/');

        if (rem.startsWith("c:/")){
            rem = rem.substring(2);
        }

        System.out.println(rem);
    }
}