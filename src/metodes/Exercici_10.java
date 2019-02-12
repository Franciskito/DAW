package metodes;

public class Exercici_10 {
    public static void main (String[]args){
        int x=5;
        int y=2;
        int z=4;
        System.out.println("X=" + x);
        System.out.println("Y=" + y);
        System.out.println("Z=" + z);

        Exercici_10 p= new Exercici_10();
        p.abc(x,y,z);
    }
    public void abc(int a, int b, int c){
        int var;
        int var2;

        if (a>b & a>c & c>b){
            var=c;
            c=a;
            a=b;
            b=var;
        }
        if (a>b & a>c & c<b){
            var=b;
            var2=c;
            c=a;
            a=var2;
            b=var;
        }
        if (a<b & a<c & c<b){
            var=c;
            c=b;
            b=var;
        }
        if (a>b & a<c & b<c){
            var=b;
            b=a;
            a=var;
        }

        System.out.println("A=" + a);
        System.out.println("B=" + b);
        System.out.println("C=" + c);
    }
}