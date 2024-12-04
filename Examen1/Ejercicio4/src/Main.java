import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] secuencia_sucia = scanner.nextLine().toCharArray();
        char[] segmento_sucio = scanner.nextLine().toCharArray();


        int espacios = 0;

        for (int i = 0; i < secuencia_sucia.length; i++){
            if (secuencia_sucia[i] == ' '){
                espacios++;
            }
        }

        char[] secuencia = new char[secuencia_sucia.length];
        for (int i = 0; i < secuencia.length; i++){
            if (secuencia_sucia[i] != ' '){
                secuencia[i] = secuencia_sucia[i];
            }
        }

        espacios = 0;

        for (int i = 0; i < segmento_sucio.length; i++){
            if (segmento_sucio[i] == ' '){
                espacios++;
            }
        }

        char[] segmento = new char[segmento_sucio.length];
        for (int i = 0; i < segmento.length; i++){
            if (segmento_sucio[i] != ' '){
                segmento[i] = segmento_sucio[i];
            }
        }

        boolean contiene  = true;
        for (int i = 0; i < secuencia.length; i++){
            contiene  = true;
            if (secuencia[i] == segmento[0]){
                for (int j = 0; j < segmento.length; j++){
                    if (secuencia[i] != segmento[j]){
                        contiene = false;
                    }
                }
            }
        }
        for (int i = 0; i < secuencia.length; i++){
            System.out.print(secuencia[i]);
        }
        System.out.println();
        for (int i = 0; i < segmento.length; i++){
            System.out.print(segmento[i]);
        }
        System.out.println();
        System.out.println(contiene);




    }
}