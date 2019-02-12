package metodes;

import java.util.Scanner;
import utilitats.UtilitatsConsola;
public class Exercici_8 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner teclat = new Scanner(System.in);
        System.out.print("1-Trobar el major de dos sencers.");
        System.out.print("2-Trobar el major de tres sencers.");
        System.out.print("3-Mostrar la relació entre dos sencers a<b o a=b o a> b");
        int opcio = UtilitatsConsola.llegirSencer("Opcio 1, 2 o 3:");

        Exercici_8 p = new Exercici_8();

        /*major dos sencers */
        if (opcio == 1) {
            num1 = UtilitatsConsola.llegirSencer("Intro numero: ");
            num2 = UtilitatsConsola.llegirSencer("Intro numero: ");
            p.dossencers(num1, num2);
        }
        /*major tres sencers */
        if (opcio == 2){
            num1 = UtilitatsConsola.llegirSencer("Intro numero: ");
            num2 = UtilitatsConsola.llegirSencer("Intro numero: ");
            num3 = UtilitatsConsola.llegirSencer("Intro numero: ");
            p.tressencers(num1, num2, num3);
        }
        /*major dos sencers */
        if (opcio == 3){
            num1 = UtilitatsConsola.llegirSencer("Intro numero: ");
            num2 = UtilitatsConsola.llegirSencer("Intro numero: ");
            p.relacio(num1, num2);
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

    }
