/**
 * Created by Utente on 15/01/2016.
 */
public class Sum10 {

    public static void main(String[] args) {

        makes10(9, 10);
        makes10(9, 9);
        makes10(1, 9);
    }

    public static boolean makes10(int a, int b) {
        boolean dieci = false;

        if ((a + b) == 10 || a == 10 || b == 10) {
            dieci = true;
            System.out.println("Il risultato è: " + dieci);
            return dieci;
        } else {
            System.out.println("Il risultato è: " + dieci);
            return dieci;
        }
    }
}
