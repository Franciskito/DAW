package exercicisArrays;
import utilitats.UtilitatsConsola;

public class Exercici_8 {
    public static void main(String[] args) {
        Exercici_8 p= new Exercici_8();
        int numNotes = UtilitatsConsola.llegirSencer("Quantitat de notes de l'alumne: ");
        double[] notes = new double[numNotes];
        for (int index = 0; index < notes.length; index++) {
            notes[index] = UtilitatsConsola.llegirDouble("Nota " + index + ": ");
        }
        System.out.println(UtilitatsConsola.ArrayDoubleToString(notes));
        System.out.println(p.calculaMitjana(notes,numNotes));
    }

    public double calculaMitjana(double[] valors,int numNotes) {
        double resultat=0;
        for (int index = 0; index < numNotes; index++) {
            resultat+=valors[index];
        }
        return resultat/numNotes;
    }
}
