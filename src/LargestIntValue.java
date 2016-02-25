/**
 * Created by Utente on 16/02/2016.
 */
public class LargestIntValue {

    public static void main(String[] args) {
        intMax(1, 2, 3); //3
        intMax(1, 3, 12); //3
        intMax(3, 2, 1); //3
        intMax(16,893,0); //893

    }

    public static int intMax(int a, int b, int c) {

        int biggest;

        if(a>b && a>c){
            biggest = a;
            System.out.println("Il numero più grande è: "+a);
            return biggest;
        }else if(b>c && b>a){
            biggest = b;
            System.out.println("Il numero più grande è: "+b);
            return biggest;
        }else{
            biggest = c;
            System.out.println("Il numero più grande è: "+c);
            return biggest;
        }
    }
}
