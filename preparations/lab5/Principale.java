package preparations.lab5;

import java.util.ArrayList;

public class Principale {

    public static void main(String [] args) {
        NDouble n = new NDouble(1);
        NDouble n2 = new NDouble(1);
        NDouble n3 = n.add(n2);

        System.out.println(n);
        System.out.println(n2);
        System.out.println(n3);


        Fraction f = new Fraction(1, 2);
        Fraction f2 = f.add(new Fraction(2,5));
        Fraction f3 = f2.add(new Fraction(2,5));

        System.out.println(f);
        System.out.println(f2);
        System.out.println(f3);

        var list = new ArrayList<Fraction>();
        list.add(f);
        list.add(new Fraction(2, 5));
        list.add(new Fraction(2, 5));

        var resultat = somme(list);
        System.out.println(resultat);
    }

    public static < N extends Nombre< N > > Nombre< N > somme( ArrayList< N > tableau ) {
        N n = null;
        if (!tableau.isEmpty()) {
           n = tableau.get(0);
           for (var i = 1; i < tableau.size(); ++i) {
               n = n.add(tableau.get(i));
           }
        }
        return n;
    }
}
