/*Crea un mètode recursiu que calculi em màxim comú divisor de dos números utilitzant l'algorisme d'euclides: El mcd de m i n s'obté seguint el següent algorisme*/

package recursivitat;
import utilitats.UtilitatsConsola;
public class Exercici_7 {

    public static void main(String[] args) {
        Exercici_7 p = new Exercici_7();
        int a = UtilitatsConsola.llegirSencer("Intro numero: ");
        int b = UtilitatsConsola.llegirSencer("Intro numero: ");

        System.out.println("El máximo común divisor de " + a + " y " + b + " es: " + p.maximdivisor(a, b));
    }


    public int maximdivisor(int num1, int num2) {
        if (num2 == 0)
            return num1;
        return maximdivisor(num2, num1 % num2);

    }

}
