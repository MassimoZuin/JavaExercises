/**
 * Created by Utente on 16/02/2016.
 */
public class StringNTimes {

    public static void main(String[] args) {

        stringTimes("Hi", 2); //"HiHi"
        stringTimes("Hi", 3); //"HiHiHi"
        stringTimes("Hi", 1); //"Hi"
        stringTimes("Hi", 12 ); //"Hi12 times"
    }


    public static String stringTimes(String str, int n) {

        StringBuilder stringresult = new StringBuilder();
        if (n==0)
            return null;
        else {

            for (int cont = 0; cont < n; cont++){
                stringresult.append(str);

            }
        }
        System.out.println("Il risultato è:" +stringresult);
        return stringresult.toString();
    }
}
