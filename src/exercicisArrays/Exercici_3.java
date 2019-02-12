package exercicisArrays;
import utilitats.UtilitatsConsola;

public class Exercici_3 {

    public static void main(String[] args) {
        Exercici_3 p = new Exercici_3();

        System.out.println("Array_1 = " + UtilitatsConsola.ArrayToString(p.creaArray(15, 4, 22)));
        System.out.println("Array_2 = " + UtilitatsConsola.ArrayToString(p.creaArray(5, 30, 60)));
        System.out.println("Array_3 = " + UtilitatsConsola.ArrayToString(p.creaArray(22, 44, 80)));
    }

    public int[] creaArray(int longitud, int minim, int maxim) {
        int[] vector = new int[longitud];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = minim + (int) (Math.random() * (maxim - minim + 1));
        }
        return vector;
    }

}
