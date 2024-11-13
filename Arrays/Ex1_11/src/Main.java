import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] prim = new int[100];
        int[] seg = new int[100];
        for (int i = 0; i < prim.length; i++){
            prim[i] = i+1;
        }
        for (int i = 0; i < prim.length; i++){
            seg[i] = prim[prim.length - 1 - i];
        }

        for (int i = 0; i < prim.length; i++){
            System.out.println(prim[i]);
        }
        for (int i = 0; i < prim.length; i++){
            System.out.println(seg[i]);
        }
    }
}