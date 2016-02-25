/**
 * Created by Utente on 15/01/2016.
 */
public class ParrotBoolean {

    public static void main(String[] args) {

        System.out.println("puto parrot "+ parrotTrouble(true, 6));
        System.out.println(parrotTrouble(true, 7));
        System.out.println(parrotTrouble(false, 6));
    }

    public static boolean parrotTrouble(boolean talking, int hour) {

        if (talking && (hour>=20 || hour<7))

            return true;

        else

            return false;
    }
}
