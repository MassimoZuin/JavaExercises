/**
 * Created by Utente on 11/02/2016.
 */
public class NotString {

    public static void main(String[] args) {

        notString("candy");
        notString("x");
        notString("not bad");
        notString("kupa not bad");
    }

    public static String notString(String str) {

        String stringNOT = "not";
        String stringaFinale = "";

        if (str.toLowerCase().startsWith(stringNOT)){
            stringaFinale = str;
            System.out.println("Il risultato è: "+stringaFinale);
            return stringaFinale;
        } else {
            stringaFinale = stringNOT + " " + str;
            System.out.println("Il risultato è: "+stringaFinale);
            return stringaFinale;
        }


    }


}
