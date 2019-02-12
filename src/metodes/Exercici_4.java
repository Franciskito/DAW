package metodes;

import java.util.Scanner;
public class Exercici_4 {
    public static void main(String[] args) {
        Exercici_3 p= new Exercici_3();
        int valor= p.llegirnum();
    }
    public int llegirnum() {
        int num;
        Scanner teclat = new Scanner(System.in);
        System.out.print("Introdueix num: ");
        num = teclat.nextInt();
        return num;
    }
    public boolean parell(int valor){
        if (valor%2==0) {
            return true;
        }else{
            return false;
        }

    }
}
