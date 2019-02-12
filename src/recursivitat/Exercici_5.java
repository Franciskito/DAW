/*Escriu un mètode que calculi el terme n-essim de la sèrie de Fibonacci de forma recursiva. Des del main crida aquest mètode per a mostrar els 10 primers termes de la successió.*/

package recursivitat;
public class Exercici_5 {
    public static void main(String[] args) {
        Exercici_5 p = new Exercici_5();

        for(int i=0; i<10; i++){
            System.out.println("fib("+i+")= "+p.fibonacci(i));
        }
    }

    public int fibonacci(int num) {
        if (num == 0) {
            return num;
        } else if (num == 1) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
}
