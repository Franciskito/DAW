/*Repeteix el problema anterior de forma iterativa.*/

package recursivitat;
import utilitats.UtilitatsConsola;
public class Exercici_4 {
    public static void main (String[]args) {
        Exercici_3 p = new Exercici_3();
        int a= UtilitatsConsola.llegirSencer("Intro numero: ");
        int b= UtilitatsConsola.llegirSencer("Intro numero: ");
        int resultat;

        resultat = p.calculoproducto(a, b);
        System.out.println("El resultat es: " + resultat);
    }

    public int calculoproducto(int a,int b) {

        int resultat = 0;
        for (int i = 0; i < a; i++) {
            resultat = resultat + b;

        }
        return resultat;
    }
}
