package ordenacio;
import utilitats.UtilitatsConsola;

public class Exercici_2 {
    public static void main(String[] args){
        Exercici_2 p = new Exercici_2();
        int[] Array1 = p.creaArray(20,1,100);
    }

    public int[] creaArray(int longitud, int minim, int maxim) {
        int[] vector = new int[longitud];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = minim + (int) (Math.random() * (maxim - minim + 1));
            System.out.println(vector[i]);
        }
        UtilitatsConsola.Bimbolla(vector);
        for (int i = 0; i < vector.length ; i++) {
            System.out.println(vector[i]);
        }

        return vector;
    }
}
