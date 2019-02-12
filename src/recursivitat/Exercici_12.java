package recursivitat;

public class Exercici_12 {/** Descomposa unn sencer en sumes de sencers menors que ell.
 *
 * @param n El número que ha de descomposar en sumes
 * @param s La cadena de la descomposició fins aquest moment
 */
public void descomposa(int n, String s) {
    if (n == 0) {
        s=s.substring(0, s.length()-1);
        System.out.println(s);
    } else if (n == 1) {
        s = s + "1";
        System.out.println(s);
    } else {
        for (int i = 1; i <= n; i++) {
            descomposa(n - i, s + i + "+");
        }
    }
}

    /**
     *
     * @param args Els arguments passats per la línia de comandes
     */
    public static void main(String[] args) {

        Exercici_12 p = new Exercici_12();

        //Executa el mètode inici de l'objecte p
        p.descomposa(4, "4=");
    }

}
