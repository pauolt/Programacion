import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String tex = "Soy productivo programando en Prolog";
        String pre = "pro";
        String[] texPartes = tex.split(" ");

        for (int i = 0; i < texPartes.length; i++){
            if (texPartes[i].toLowerCase().startsWith(pre)){
                System.out.println(texPartes[i]);
            }

        }

    }
}