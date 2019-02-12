package exercicisArrays;

public class Exercici_2 {
    public static void main(String[] args) {
        Exercici_2 p = new Exercici_2();
        int[] arraynumeros = {12, 25, 5, 30, 12};
        int suma = p.sumaArray(arraynumeros);
        System.out.println("Suma: " +  suma);
    }


    public  int  sumaArray(int[] valors) {
        int suma = 0;
        for (int i = 0; i < valors.length; i++){
            suma += valors[i];
        }
        return suma;
    }
}