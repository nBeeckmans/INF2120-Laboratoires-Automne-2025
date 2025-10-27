package demonstrations.lab5;

import java.util.ArrayList;

public class Principale {
    public static void main(String[] args) {

    }

    public static < N extends Nombre< N > > Nombre< N > somme( ArrayList< N > tableau ) throws Exception {
        if (tableau.isEmpty()) {
            throw new Exception("Pas d'elements dans le tableau");
        }
        Nombre<N> resultat = tableau.getFirst();

        for (int i = 1; i < tableau.size(); ++i) {
            N element = tableau.get(i);
            resultat = resultat.add(element);

        }

        return resultat;
    }
}
