package recursivitat;

public class Exercici_8 {
    /**
     * Comprova si la cadena és simètrica. Ho fa recursivament. Si la primera
     * lletra és igual que la darrera, comprova si la subcadena central ho és.
     *
     * @param s
     * @return true si la cadena és simètrica o false en cas contrari
     */
    public boolean simetrica(String s) {
        if (s.length() <= 1) {
            return true;
        } else {
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                return simetrica(s.substring(1, s.length() - 1));
            } else {
                return false;
            }
        }
    }

    /**
     *
     * @param args Els arguments passats per la línia de comandes
     */
    public static void main(String[] args) {

        Exercici_8 p = new Exercici_8();

        String s = "sesonoses";
        if (p.simetrica(s)) {
            System.out.println(s + " és simètrica");
        } else {
            System.out.println(s + " és simètrica");
        }
    }
}
