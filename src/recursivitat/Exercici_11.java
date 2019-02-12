package recursivitat;
import utilitats.UtilitatsConsola;

public class Exercici_11 {
    public static void main(String[] args) {
        Exercici_11 x = new Exercici_11();
        int num;

        //Utilitzam el valor absolut del nombre que ens han escrit
        num = Math.abs(UtilitatsConsola.llegirSencer("Entri el nombre: "));


        System.out.println("Xifres Invers Recursiu");
        x.xifresInversRecursiu(num);
        System.out.println();
    }



    /**
     * Mostra les xifres en l'ordre invers de forma recursiva. Només funciona
     * per a nombres positius. Si caviam la condició num>10 per num!=0
     * funcionarà sempre, però ens afegirà un zero al davant.
     *
     * @param num
     */
    private void xifresInversRecursiu(int num) {
        if (num >= 10) {
            System.out.print(num % 10 + " ");
            xifresInversRecursiu(num / 10);
        } else {
            System.out.print(num + " ");
        }
    }
}
