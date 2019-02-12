package recursivitat;

public class Factorial {/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
    Factorial f = new Factorial();
    System.out.println(f.factorial(5));
}

    public int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}
