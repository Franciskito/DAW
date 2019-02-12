package metodes;

import java.util.Scanner;
import utilitats.UtilitatsConsola;
public class Exercici_11 {
    public static void main (String[]args){
        Exercici_11 p = new Exercici_11();
        p.principal();
    }

    public void principal(){
        int num1, num2, num3;
        Scanner teclat = new Scanner(System.in);
        System.out.println("1-Trobar el major de dos sencers.");
        System.out.println("2-Trobar el major de tres sencers.");
        System.out.println("3-Mostrar la relació entre dos sencers a<b o a=b o a> b");
        System.out.println("4-Mostrar la taula de multiplicar d'un nombre donat.");
        System.out.println("5-Mostrar els divisors d'un nombre.");
        System.out.println("6-Tornar el factorial d'un nombre.");
        System.out.println("7-Tornar si un nombre és primer o no.");
        System.out.println();
        int opcio = UtilitatsConsola.llegirSencer("Opcio 1, 2, 3, 4, 5, 6, 7:");

        /*major dos sencers */
        if (opcio == 1) {
            num1 = UtilitatsConsola.llegirSencer("Intro numero: ");
            num2 = UtilitatsConsola.llegirSencer("Intro numero: ");
            dossencers(num1, num2);
        }
        /*major tres sencers */
        if (opcio == 2){
            num1 = UtilitatsConsola.llegirSencer("Intro numero: ");
            num2 = UtilitatsConsola.llegirSencer("Intro numero: ");
            num3 = UtilitatsConsola.llegirSencer("Intro numero: ");
            tressencers(num1, num2, num3);
        }
        /*major dos sencers */
        if (opcio == 3){
            num1 = UtilitatsConsola.llegirSencer("Intro numero: ");
            num2 = UtilitatsConsola.llegirSencer("Intro numero: ");
            relacio(num1, num2);
        }
        int num;

        /*Mostrar la taula de multiplicar d'un nombre donat.*/
        if (opcio == 4) {
            num = UtilitatsConsola.llegirSencer("Intro numero: ");
            taulamultiplicar(num);
        }
        /*Mostrar els divisors d'un nombre.*/
        if (opcio == 5) {
            num = UtilitatsConsola.llegirSencer("Intro numero: ");
            divisors(num);
        }
        /*Tornar el factorial d'un nombre.*/
        if (opcio == 6) {
            num = UtilitatsConsola.llegirSencer("Intro numero: ");
            factorial(num);
        }
        /*Tornar si un nombre és primer o no.*/
        if (opcio == 7) {
            num = UtilitatsConsola.llegirSencer("Intro numero: ");
            primer(num);
        }
    }

    /*procedimients interns*/
    public void  dossencers(int a, int b){
        if (a > b) {
            System.out.println("El major es:" + a);
        }else{
            System.out.println("El major es:" + b);
        }
    }

    public void  tressencers(int a, int b, int c){
        if (a > b) {
            if (a > b) {
                System.out.println("El mayor es: " + a);
            } else {
                System.out.println("el mayor es: " + c);
            }
        } else if (b > c) {
            System.out.println("el mayor es: " + b);
        } else {
            System.out.println("el mayor es: " + c);
        }
    }

    public void relacio (int a, int b) {
        if (a > b) {
            System.out.println(a + ">" + b);
        } else {
            if (a == b) {
                System.out.println(a + "=" + b);
            } else {
                System.out.println(a + "<" + b);
            }
        }

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