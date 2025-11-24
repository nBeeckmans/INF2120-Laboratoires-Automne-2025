package preparations.lab10;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Principale {

    public static void main(String[] args){
        Fraction [] fs = new Fraction[10];
        for(int i =1; i < 11; ++i) {
            fs[i - 1] = new Fraction(i, 2);
        }

        int trouve = FouilleBinaire(fs, new Fraction(1,2));
        System.out.println(trouve);
        trouve = FouilleBinaire(fs, new Fraction(8,2));
        System.out.println(trouve);
        trouve = FouilleBinaire(fs, new Fraction(15,2));
        System.out.println(trouve);

        trouve = FouilleBinaireR(fs, new Fraction(1,2), 0, fs.length-1);
        System.out.println(trouve);
        trouve = FouilleBinaireR(fs, new Fraction(8,2), 0, fs.length-1);
        System.out.println(trouve);
        trouve = FouilleBinaireR(fs, new Fraction(15,2), 0, fs.length-1);
        System.out.println(trouve);


        Comparator<Fraction> c = (Fraction a, Fraction b) -> {
                Fraction g = (Fraction) a;
                Fraction d = (Fraction) b;
                return g.compareTo(d);
        };

        trouve = Arrays.binarySearch(fs, 0, fs.length-1, new Fraction(1,2), c);
        System.out.println(trouve);

        trouve = Arrays.binarySearch(fs, 0, fs.length-1, new Fraction(8,2), c);
        System.out.println(trouve);

        trouve = Arrays.binarySearch(fs, 0, fs.length-1, new Fraction(15,2), c);
        System.out.println(trouve);
    }

    public static < E extends Comparable< E > > int FouilleBinaire( E [] tableau, E element ) {
        assert tableau != null;
        assert element != null;

        int debut = 0, fin = tableau.length - 1, milieu = (debut + fin) / 2;

        E temp = null;
        while(debut < fin) {
            temp = tableau[milieu];
            int comparaison = temp.compareTo(element);
            if (comparaison < 0) {
                debut = milieu +1;
            } else {
                fin = milieu;
            }
            milieu = (debut + fin)/2;
        }

        return tableau[debut].compareTo(element) == 0 ?debut : -1;
    }

    public static < E extends Comparable< E > > int FouilleBinaireR( E []tableau, E element, int debut, int fin ){
        assert tableau != null;
        assert element != null;
        int milieu = (debut + fin) / 2;
        if (debut >= fin) {
          return tableau[debut].compareTo(element) == 0 ? debut : -1;
        }

        int comparaison = tableau[milieu].compareTo(element);
        if (comparaison < 0) {
            return FouilleBinaireR(tableau, element, milieu + 1, fin);
        } else {
            return FouilleBinaireR(tableau, element, debut, milieu);
        }
    }
}
