package demonstrations.lab10;
import java.util.Arrays;
import java.util.Comparator;

public class Principale {
    public static void main(String [] args) {
        int tailles[] = {1,2,3,16};
        for (int taille : tailles) {
            Fraction[] fractions = new Fraction[taille];
            for (int i = 0; i < taille; ++i){
                fractions[i] = new Fraction(i, 10);
            }

            int debut =0;
            int fin = fractions.length -1;
            int milieu =(int) Math.random() * (fin - debut);

            Fraction recherchee = fractions[debut];
            assert fouilleB(fractions, recherchee) == debut;

            recherchee = fractions[fin];
            assert fouilleB(fractions, recherchee) == fin;

            recherchee = fractions[milieu];
            assert fouilleB(fractions, recherchee) == milieu;

            recherchee = new Fraction(taille +1, 10);
            assert fouilleB(fractions, recherchee) == -1;

            recherchee = new Fraction(-1, 10);
            assert fouilleB(fractions, recherchee) == -1;

            Comparator<Fraction> c = (Fraction a, Fraction b) -> {
                return a.compareTo(b);
            };

            Comparator<Fraction> c2 = new Comparator<Fraction>() {
                    private int a = 0;
                    @Override
                    public int compare(Fraction arg0, Fraction arg1) {
                        a++;
                            return arg0.compareTo(arg1);
                    }

                    public int getNombreCompare() {
                        return this.a;
                    }
                };

            Arrays.binarySearch(
                                fractions,
                                0,
                                fractions.length -1,
                                fractions[milieu],
                                c);
        }
    }

    public static <E extends Comparable<E>> int fouilleB(E[] tableau, E cible) {
        assert tableau != null;
        assert cible != null;
        int debut = 0, fin = tableau.length -1;
        while( debut < fin ) {
            int milieu = (debut + fin) / 2;
            int comparaison = cible.compareTo(tableau[milieu]);
            if ( comparaison <= 0) {
                fin = milieu;
            } else {
                debut = milieu + 1;
            }
        }

        if ( tableau[debut].compareTo(cible) != 0 ) {
            return -1;
        }

        return debut;
    }
}
