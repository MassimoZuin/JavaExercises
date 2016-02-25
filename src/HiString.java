/**
 * Created by Utente on 16/02/2016.
 */
public class HiString {

    public static void main(String[] args) {


        startHi("hi there");    //mi legge i primi 2 caratteri, se la string inizia con hi, ritorna true
        startHi("Hi");
        startHi("hello hi");
        startHi("maledetto comunist hi");
    }

    public static boolean startHi(String str) {

        boolean result = true;
        //String compare = "hi";

        if (str.toLowerCase().startsWith("hi")){
            System.out.println("La stringa inzia con hi");
            return result;
        }
        else
        {
            result = false;
            System.out.println("La stringa NON inzia con hi");
            return false;
        }
    }




    }
