/*El factorial d'un natural es pot definir de forma recursiva com n!=n*(n-1)! Amb el cas especial 1!=1. Crea un mètode que donat un paràmetre n torni (return) el factorial de n. Realitza el càlcul de forma recursiva.*/

package recursivitat;
import utilitats.UtilitatsConsola;
public class Exercici_2 {
    public static void main(String[] args){

        Exercici_2 p = new Exercici_2();
        long resultat = p.factorial (UtilitatsConsola.llegirSencer("Intro numero: "));
        System.out.println("El factorial és: " + resultat);
    }


    public long factorial(int nombre) {
        long resultat;
        if (nombre > 0) {
            System.out.println(nombre + " * factorial(" + (nombre - 1) + ")");
            resultat = nombre * factorial(nombre - 1);
        } else {
            System.out.println("Factorial(0)" );
            resultat = 1;
        }
        return resultat;
    }
}