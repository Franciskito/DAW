
package exercicisArrays;
import utilitats.UtilitatsConsola;

public class Exercici_9 {
    public static void main(String[] args) {
        String[] opcions={"Primera opció", "Segona opció", "Tercera opció", "Acabar"};
        int opció=0;
        do {
            opció = UtilitatsConsola.gestionarMenu("Menú de opcions", opcions, "Tria una opció: ");
        }while(opció!=4);
    }
}
