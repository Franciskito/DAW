package exercicisArrays;
import utilitats.UtilitatsConsola;

public class Exercici_1 {
    public static void main(String[] args) {
        int[] arraydenumeros={10, 11, 12, 13, 14};
        String TexteArray;
        TexteArray = UtilitatsConsola.ArrayToString(arraydenumeros);
        System.out.println(TexteArray);
    }
}