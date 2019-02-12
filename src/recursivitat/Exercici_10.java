package recursivitat;
import utilitats.UtilitatsConsola;
public class Exercici_10 {public static void main(String[] args) {
    Exercici_10 x = new Exercici_10();
    int num;

    //Utilitzam el valor absolut del nombre que ens han escrit
    num = Math.abs(UtilitatsConsola.llegirSencer("Entri el nombre: "));

    System.out.println("Xifres Recursiu");
    x.xifresRecursiu(num);
    System.out.println();
}


    /**
     * Mostra les xifres en l'ordre correcte de forma recursiva. Només funciona
     * per a nombres positius. Si caviam la condició num>10 per num!=0
     * funcionarà sempre, però ens afegirà un zero al davant.
     *
     * @param num
     */
    private void xifresRecursiu(int num) {
        if (num >= 10) {
            xifresRecursiu(num / 10);
            System.out.print(num % 10 + " ");
        } else {
            System.out.print(num + " ");
        }
    }

}
