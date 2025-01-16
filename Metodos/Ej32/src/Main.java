public class Main {

    public static int[] booleanCount (boolean[] array){
        int[] cont = new int[2];
        for (int i = 0; i < array.length; i++){
            if (array[i]){
                cont[0]++;
            } else {
                cont[1]++;
            }
        }
        return cont;

    }

    public static void main(String[] args) {

        for (int i : booleanCount())

    }
}