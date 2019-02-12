package utilitats;
import java.util.Scanner;
public class UtilitatsConsola {

    public static int llegirSencer(String Texte) {
        Scanner teclat = new Scanner(System.in);
        System.out.print(Texte);
        return teclat.nextInt();
    }

    public static String llegirCadena(String Texte) {
        Scanner teclat = new Scanner(System.in);
        System.out.print(Texte);
        return teclat.next();
    }

    public static double llegirDouble(String Texte) {
        Scanner teclat = new Scanner(System.in);
        System.out.print(Texte);
        return teclat.nextDouble();
    }

    public static String ArrayToString(int[] vector) {
        String Texte = "";
        for (int num = 0; num < vector.length; num++) {
            Texte = Texte + vector[num] + "," + " ";
        }
        return Texte;
    }

    public static String ArrayDoubleToString(double[] vector) {
        String Texte = "";
        for (int num = 0; num < vector.length; num++) {
            Texte = Texte + vector[num] + "," + " ";
        }
        return Texte;
    }

    public static int gestionarMenu(String Titol, String[] Opcions, String Pregunta) {
        int opcio = -1;
        System.out.println(Titol);
        for (int num = 0; num < Opcions.length; num++) {
            System.out.println((num + 1) + " - " + Opcions[num]);
        }
        do {
            opcio = llegirSencer(Pregunta);
        } while (opcio < 1 || opcio > Opcions.length);
        return opcio;
    }

    public static void Bimbolla(int[] a) {
        int i, j, aux;
        for (i = 0; i < a.length - 1; i++) {
            for (j = 0; j < a.length - i - 1; j++) {
                if (a[j + 1] < a[j]) {
                    aux = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = aux;
                }
            }
        }
    }
}
