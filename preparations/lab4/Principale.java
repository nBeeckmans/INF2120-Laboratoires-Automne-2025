package preparations.lab4;

import java.util.Optional;
import java.util.ArrayList;

public class Principale {
    public static void main(String[] args) {
        var list = tweens(0, 1, 10000000);
        var list2 = tweens2(0, 1, 10000000);

        for (int i = 0; i < list.size(); ++i) {
            var i1 = list.get(i);
            var i2 = list2.get(i);
            System.out.println(String.format("%f, %f", i1, i2));
        }

    }

    public static <T> PeutEtre<Integer> trouverElement( T[] a_tableau, T a_element ) {
        PeutEtre<Integer> element = new Rien<Integer>();
        for (int i = 0; i < a_tableau.length; i++) {
            if( a_tableau[i].equals(a_element)) {
                element = new QQChose<Integer>(i);
            }
        }

        return element;
    }

    public static <T> Optional<Integer> trouverElement2( T[] a_tableau, T a_element) {
        Optional<Integer> ret = Optional.empty();
        for (int i = 0; i < a_tableau.length; i++) {
            if( a_tableau[i].equals(a_element)) {
                ret = Optional.of(i);
            }
        }
        return ret;
    }

    public static ArrayList<Double> tweens( double depart, double fin, int nbrInterval) {
       double interval = (fin - depart) / nbrInterval;

       ArrayList<Double> list = new ArrayList<Double>(nbrInterval + 1);
       list.add(depart);

       for (int i = 0; i < nbrInterval; ++i) {
           // list.add(list.get(i) + interval); -> prb de precision !! :D
           list.add(depart + interval * i);
       }

       return list;
    }


    public static ArrayList<Double> tweens2( double depart, double fin, int nbrInterval) {
       double interval = (fin - depart) / nbrInterval;

       ArrayList<Double> list = new ArrayList<Double>(nbrInterval + 1);
       list.add(depart);

       for (int i = 0; i < nbrInterval; ++i) {
         list.add(list.get(i) + interval); //-> prb de precision !! :D
       }

       return list;
    }
}
