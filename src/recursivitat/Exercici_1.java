/*
A una classe nova, escriu un mètode que calculi de forma recursiva la suma dels n primers enters,
és a dir, la suma dels 5 primers enters és 5+4+3+2+1, la de 4 és 4+3+2+1.
 */

package recursivitat;
import utilitats.UtilitatsConsola;
public class Exercici_1 {
    public static void main (String[]args) {
        Exercici_1 p = new Exercici_1();
        int suma;
        int num= UtilitatsConsola.llegirSencer("Intro numero: ");

        if (num < 0){
            System.out.println("El numero introduit es negatiu");
        }else{
            suma=p.calculosuma(num);
            System.out.println("La suma dels numeros es: " + suma);
        }
    }

    public int calculosuma(int num){
        int i, suma=0;
        for(i=1;i<=num;i++)
            suma = suma + i;
        return suma;
    }
}