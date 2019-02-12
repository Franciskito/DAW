package exercicisArrays;
import utilitats.UtilitatsConsola;

public class Exercici_4 {
    public static void main(String[] args) {
        Exercici_4 p = new Exercici_4();

        int[] arrayA = p.creaArray(4,1,5);
        int[] arrayB= p.creaArray(4,1,5);

        /* per prova
        int[] arrayA = {10, 11, 12, 13, 14};
        int[] arrayB = {10, 11, 12, 13, 14};
        */

        System.out.println("a: " + UtilitatsConsola.ArrayToString(arrayA));
        System.out.println("b: " +  UtilitatsConsola.ArrayToString(arrayB));
        System.out.println(p.comparaArrays(arrayA, arrayB));
    }




    public int[] creaArray(int longitud, int minim, int maxim) {
        int[] vector = new int[longitud];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = minim + (int) (Math.random() * (maxim - minim + 1));
        }
        return vector;
    }

    public boolean comparaArrays(int[] a, int[] b) {
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

}
