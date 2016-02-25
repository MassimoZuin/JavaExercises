/**
 * Created by Utente on 15/01/2016.
 */
public class AbsDiff {

    public static void main(String[] args) {    //questo è il mio main

        System.out.println(diff21(19));                        //chiama il programma con questi due parametri
        System.out.println(diff21(10));                        //chiama il programma con questi due parametri
        System.out.println(diff21(21));                        //chiama il programma con questi due parametri
        System.out.println(diff21(22));                        //chiama il programma con questi due parametri

    }

    public static int diff21(int n) {                           //programma

        if (n>21)
            return Math.abs(21 - n)*2;
        else
            return Math.abs(21 -n);
    }
}
