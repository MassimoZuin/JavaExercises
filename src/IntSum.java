/**
 * Created by Utente on 15/01/2016.
 */
public class IntSum {       //nome della classe che puo essere chiamata da una altra classe dentro un altro programma
    //principale

    public static void main(String[] args) {    //questo è il mio main

        System.out.println(sumDouble(1, 2));                        //chiama il programma con questi due parametri
        System.out.println(sumDouble(3, 2));                        //chiama il programma con questi due parametri
        System.out.println(sumDouble(2, 2));                        //chiama il programma con questi due parametri

    }

    public static int sumDouble(int a, int b) {                     //programma da eseguire

        if (a == b) {

            return (a + b) * 2;
        } else {

            return (a + b);
        }

    }
}
