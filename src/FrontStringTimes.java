/**
 * Created by Utente on 25/02/2016.
 */
public class FrontStringTimes {

    public static void main(String[] args) {

        frontTimes("Chocolate", 2); //→ "ChoCho"
        frontTimes("Chocolate", 3); //→ "ChoChoCho"
        frontTimes("Abc", 5);       // → "AbcAbcAbcAbcAbc"
        frontTimes("k",8);          // kkkkkkkk
        frontTimes("", 50);        // ""
    }

    public static String frontTimes(String str, int n) {
        String firstChar;
        int chars = 3;
        StringBuilder stringresult = new StringBuilder();

        if (str.length()<3){
            chars = str.length();
        }

        firstChar = str.substring(0, chars);

        for (int i =0; i < n; i++){

            stringresult.append(firstChar);
        }

        System.out.println("La stringa ripetuta è:" + stringresult);
        return stringresult.toString();
    }
}
