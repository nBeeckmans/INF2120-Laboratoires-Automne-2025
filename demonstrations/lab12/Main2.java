import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main2 {
    public static void main(String [] args) {

        Consumer<Integer> c = (Integer i) -> {
            System.out.println(i);
        };

        Chainon tete = new Chainon();
        Chainon temp = tete;
        for (int i = 0; i < 10; ++i) {
            temp.valeur = i;
            temp.suivant = new Chainon();
            temp = temp.suivant;
        }
        temp.valeur = 10;
        tete.parcourir(c);
        Chainon inverse = tete.inverser();
        inverse.parcourir(c);
    }

    // TODO : A COMPLETER
    static public class Chainon {
        public Chainon suivant;
        public int valeur;

        public boolean aSuivant() {
        // Todo
        }

        public int somme(int depuis) {
            // Todo : en utilisant somme(indice, depuis)
        }

        private int somme(int indice, int depuis) {
            // Todo
        }

        private Chainon inverser() {
            // Todo
        }

        public void parcourir(Consumer<Integer> i) {
            // Todo
        }
    }
}
