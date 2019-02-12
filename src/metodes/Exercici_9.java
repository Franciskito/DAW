package metodes;

import java.util.Scanner;
import utilitats.UtilitatsConsola;
public class Exercici_9 {
    public static void main(String[] args) {
        Exercici_9 p = new Exercici_9();
        int num;
        int opcio=p.opcions();

        /*Mostrar la taula de multiplicar d'un nombre donat.*/
        if (opcio == 1) {
            num = UtilitatsConsola.llegirSencer("Intro numero: ");
            p.taulamultiplicar(num);
        }
        /*Mostrar els divisors d'un nombre.*/
        if (opcio == 2) {
            num = UtilitatsConsola.llegirSencer("Intro numero: ");
            p.divisors(num);
        }
        /*Tornar el factorial d'un nombre.*/
        if (opcio == 3) {
            num = UtilitatsConsola.llegirSencer("Intro numero: ");
            p.factorial(num);
        }
        /*Tornar si un nombre és primer o no.*/
        if (opcio == 4) {
            num = UtilitatsConsola.llegirSencer("Intro numero: ");
            p.primer(num);
        }
    }
    public int opcions() {
        Exercici_9 p = new Exercici_9();
        Scanner teclat = new Scanner(System.in);
        System.out.println("1-Mostrar la taula de multiplicar d'un nombre donat.");
        System.out.println("2-Mostrar els divisors d'un nombre.");
        System.out.println("3-Tornar el factorial d'un nombre.");
        System.out.println("4-Tornar si un nombre és primer o no.");
        System.out.println();
        int opcio = UtilitatsConsola.llegirSencer("Opcio 1, 2, 3 o 4:");
        return opcio;
    }


    public void taulamultiplicar(int num){
        System.out.println("Tabla del " + num);
        for(int a = 1; a<=10; a++){
            System.out.println(num + " * " + a + " = " + num*a);
        }
    }
    public void divisors(int num){
        int a;
        System.out.println("Divisores del numero "+num);
        for(a=1;a<=num;a++){
            if (num % a== 0){
                System.out.println(a);
            }
        }
    }
    public void factorial(int num){
        int factorial=1;
        for (int a = num; a > 0; a--) {
            factorial = factorial * a;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
    public void primer(int num){
        int a,contador;
        contador = 0;
        for(a = 1; a <= num; a++)
        {
            if((num % a) == 0)
            {
                contador++;
            }
        }
        if(contador <= 2){
            System.out.println("El numero es primer");
        }else{
            System.out.println("El numero no es primer");
        }

    }
}