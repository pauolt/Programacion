import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float[] alturas = new float[n];
        float m = 0f;
        for (int i = 0; i < n; i++){
            alturas[i] = scanner.nextFloat();
        }
        m = scanner.nextFloat();
        for (int i = 0; i < n; i++){
            if(alturas[i] >= m){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
        }
    }
}