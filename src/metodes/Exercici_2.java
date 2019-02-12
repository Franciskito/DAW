package metodes;

import java.util.Scanner;
public class Exercici_2 {

    public static void main(String[] args) {
        Exercici_2 p = new Exercici_2();
        p.llegirnom();
    }

    public void llegirnom() {
        String nom;
        Scanner teclat = new Scanner(System.in);
        System.out.print("Introdueix nom: ");
        nom = teclat.next();
        simpatic(nom);
    }

    public void simpatic(String nom) {
        System.out.println("Hola " + nom);
    }
}