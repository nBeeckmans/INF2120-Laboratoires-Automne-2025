package demonstrations.lab4;
import java.util.Optional;
import java.util.ArrayList;

public class Principale {
    public static void main(String[] args) throws ARien {

        Integer[] integers = { 1, 3, 5, 6 };
        PeutEtre<Integer> resultat = trouverElement(integers, 3);
        if (resultat.estQQChose()) {
            System.out.println(resultat.qQChose());
        }

        Optional<Integer> resultat2 = trouverElement2(integers, 4);
        if (resultat2.isEmpty()) {
            System.out.println("resultat invalide 4 n'est dans le tableau");
        }
        //ArrayList<Double>
        var tableau = tweens(1.0, 3.0, 4);
        System.out.println(tableau);
    }

    public static <T> PeutEtre<Integer> trouverElement( T[] aTableau, T aElement ) {
        PeutEtre<Integer> resultat = new Rien<>();
        for (int i = 0; i < aTableau.length; ++i) {
            final T elementCourrant = aTableau[i];
            if (elementCourrant.equals(aElement)) {
                resultat = new QQChose<>(i);
            }
        }
        return resultat;
    }

    public static <T> Optional<Integer> trouverElement2( T[] aTableau, T aElement ) {
        Optional<Integer> resultat = Optional.empty();
        for (int i = 0; i < aTableau.length; ++i) {
            final T elementCourrant = aTableau[i];
            if (elementCourrant.equals(aElement)) {
                resultat = Optional.of(i);
            }
        }
        return resultat;
    }
    public static ArrayList<Double> tweens( double depart, double fin, int nbrInterval ) {
        int nbrCase = nbrInterval + 1;
        double valeurInterval = (fin - depart) / nbrInterval;
        ArrayList<Double> aRetourner = new ArrayList<Double>(nbrCase);
        aRetourner.add(0, depart);
        for (int i = 1; i < nbrCase; ++i){
            final double precedent = aRetourner.get(i -1);
            final double nouvelle = precedent + valeurInterval;
            aRetourner.add(i, nouvelle);
        }
        return aRetourner;
    }
}
