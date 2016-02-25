/**
 * Created by Utente on 11/02/2016.
 */
public class Hundred {

    public static void main(String[] args) {

        nearHundred(93);
        nearHundred(90);
        nearHundred(89);
    }



    public static boolean nearHundred(int n) {
        boolean result = false;
        int rest = 0;

        if (n <= 110)

            rest = n - 100;

        else

            rest = n - 200;

        if (Math.abs(rest)<=10){
            result = true;
            System.out.println("Il risultato è: "+result);

                return result;
        }
        else {
            System.out.println("Il risultato è: "+result);
        }
            return result;

    }

}