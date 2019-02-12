package sobrecarrega;

public class Exercici_1 {
    public void saluda() {
        System.out.println("Hola!");
    }

    /**
     * Insereix el nom dins el missatge.
     *
     * @param nom El nom que saludarà
     */
    public void saluda(String nom) {
        System.out.println("Hola " + nom + "!");
    }

    /**
     * Saluda a dues persones
     *
     * @param nom1 El nom de la primera persona
     * @param nom2 El nom de la segona persona
     */
    public void saluda(String nom1, String nom2) {
        System.out.println("Hola " + nom1 + " i " + nom2 + "!");
    }

    /**
     * Saluda una persona i li recorda els dies que feia que no la veia.
     *
     * @param nom El nom de la persona
     * @param dies El nombre de dies
     */
    public void saluda(String nom, int dies) {
        System.out.println("Hola " + nom + " ! Feia " + dies + " que no et veia!");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Exercici_1 p = new Exercici_1();
        p.saluda();
        p.saluda("Joan");
        p.saluda("Joan", "Margalida");
        p.saluda("Joan", 4);
    }
}
