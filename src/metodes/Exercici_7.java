package metodes;

import utilitats.UtilitatsConsola;

public class Exercici_7 {
    public static void main(String[] args) {
        Exercici_7 p = new Exercici_7();
        /*parell */
        int numero;
        numero = UtilitatsConsola.llegirSencer("Intro numero");
        if (p.parell(numero)) {
            System.out.println("El num es parell");
        } else {
            System.out.println("El num no es parell");
        }
        /*Mitjana*/
        double a=UtilitatsConsola.llegirDouble("Intro numero");
        double b=UtilitatsConsola.llegirDouble("Intro numero");
        double c=UtilitatsConsola.llegirDouble("Intro numero");
        p.mitjana(a,b,c);
        double total=p.mitjana(a, b, c);
        System.out.println("La mitjana es "+total);
    }

    /*procedimients interns*/
    public boolean parell(int valor) {
        if (valor % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public double mitjana(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }


}
