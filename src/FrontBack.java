/**
 * Created by Utente on 11/02/2016.
 */
public class FrontBack {

    public static void main(String[] args) {
        frontBack("code");
        frontBack("a");
        frontBack("ab");
        frontBack("porcazzo sto cazzo");
    }


    public static String frontBack(String str) {

        int length = str.length();
        String result = "";

        if (length <= 1) {
            System.out.println("La stringa swappata: "+str);
            return str;
        } else {
            result = str.charAt(length - 1) + str.substring(1, length - 1) + str.charAt(0);
            // primo carattere swappato + parte centrale + ultimo carattere swappato
            System.out.println("La stringa swappata: "+result);
            return result;
        }
    }
}