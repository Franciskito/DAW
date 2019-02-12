
package examenPractic;

public class Exercici_2 {
    public static void main(String[] args) {
        Exercici_2 p = new Exercici_2();
        int[] array1 = {1, 2, 5, 15, 30};
        int[] array2 = {1, 2, 5, 15, 30};
        p.comprovar(array1, array2);
    }

    public int[] comprovar(int[] array1, int[] array2) {
        int x;
        int y;

        int z = array1.length * array2.length;

        int[] resulat = new int [z];
        z = 0;
        for (x = 0; x < array1.length;){
            x = x + 1;
        }
        for (y = 0; y < array2.length; y = y + 1) {
                z = array1[x] + " " + array2[y];
            z += 1;
        }
        return resulat;
    }
}
