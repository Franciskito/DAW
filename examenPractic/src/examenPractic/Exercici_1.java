package examenPractic;

public class Exercici_1 {
    public static void main(String[] args) {
        Exercici_1 p = new Exercici_1();
        int[] arraynumeros = {1, 2, 20, 15, 30};
        p.comprovar(arraynumeros);
    }

    public void comprovar(int[] vector) {
        int i = 0;
        int resulat = 0;
        while ((i < 10) && (resulat == 0)) {
            if ((vector[i]) < (vector[i] + 1)) {
                resulat = 1;
            }
            i++;
        }
        if (resulat == 1) {
            System.out.println("Esta ordenat de forma creixent");
        }
        else{
            System.out.println("No esta ordenat");
        }
    }
}
