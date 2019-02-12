package metodes;

public class Exercici_5 {
    public static void main(String[] args) {
        double a=8.3;
        double b=7.8;
        double c=5.6;
        Exercici_5 p= new Exercici_5();
        p.mitjana(a,b,c);
        double total=p.mitjana(a, b, c);

        System.out.println("La mitjana es "+total);
    }
    public double mitjana(double a,double b,double c){
        return (a+b+c)/3;
    }

}