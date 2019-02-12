package recursivitat;

public class Exercici_9 {
    public static void main(String[] args) {
        Exercici_9 p=new Exercici_9();
        p.hanoi('A', 'C', 4);
    }

    public void hanoi(char origen, char desti, int nDiscs){
        if(nDiscs==1){
            System.out.println(" Mou de "+ origen+ " a "+desti);
        }else{
            char auxiliar=' ';
            for(char c='A';c<='C';c++){
                if(c!=origen && c!=desti){
                    auxiliar=c;
                }
            }
            hanoi(origen, auxiliar, nDiscs-1);
            System.out.println(" Mou de "+ origen+ " a "+desti);
            hanoi(auxiliar, desti, nDiscs-1);
        }
    }
}
