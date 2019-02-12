
/*Crea un mètode que calculi el producte de a *b utilitzant sumes. Fes-ho de forma recursiva.*/

package recursivitat;
import utilitats.UtilitatsConsola;
public class Exercici_3 {
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
        if (b > 1) {
            resultat = a + calculoproducto(a, b - 1);
        }
        else {
            resultat = a;
        }
        return resultat;
    }
}
