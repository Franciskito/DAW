package exercicisArrays;
import utilitats.UtilitatsConsola;

public class Exercici_5 {
    public static void main(String[] args) {
        Exercici_5 p = new Exercici_5();

        int[] array3 = {10,5,7};


        System.out.println(UtilitatsConsola.ArrayToString(array3));
        p.ordenaArray(array3);
        System.out.println(UtilitatsConsola.ArrayToString(array3));
    }


    public boolean ordenaArray(int[] array3){
        int var;
        int var2;

        if (array3[0]>array3[1] & array3[0]>array3[2] & array3[2]>array3[1]){
            var=array3[2];
            array3[2]=array3[0];
            array3[2]=array3[1];
            array3[1]=var;
        }
        if (array3[0]>array3[1] & array3[0]>array3[2] & array3[2]<array3[1]){
            var=array3[1];
            var2=array3[2];
            array3[2]=array3[0];
            array3[0]=var2;
            array3[1]=var;
        }
        if (array3[0]<array3[2] & array3[0]<array3[2] & array3[2]<array3[1]){
            var=array3[2];
            array3[2]=array3[1];
            array3[1]=var;
        }
        if (array3[0]>array3[2] & array3[0]<array3[2] & array3[1]<array3[2]){
            var=array3[1];
            array3[1]=array3[0];
            array3[0]=var;
        }
        return true;
    }
}
