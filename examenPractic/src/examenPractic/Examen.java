package examenPractic;

public class Examen {

    public int multiplicacio(int num1, int num2) {
        int resultat = num1*num2;
        return resultat;
    }

    public int multiplicacio(double num1, double num2) {
        double resultat = num1*num2;
        return (int) resultat;
    }

    public int multiplicacio(double num1, int num2) {
        int resultat = (int) (num1*num2);
        return resultat;
    }

    public int multiplicacio(int num1, double num2) {
        int resultat = (int) (num1*num2);
        return resultat;
    }

}
