import java.util.function.*;

interface A {
    int f1();
}

interface B {
    int f1();
    int f2();
}

public class Main {
    public static void main(String [] args) {
        Function<String, Double> stringParser = (String i) -> {
            return Double.parseDouble(i);
        }; // apply() f(R) = Z, transform d'un type a l'autre

        Predicate<String> hello = (String message ) -> {
            return message == "Hello world";
        }; // test() f(R) = {0,1}, valide quelque chose (respect d'une condition)

        Supplier<Integer> s = () -> {
            return (int) Math.random() * Integer.MAX_VALUE;
        }; // get() f() = Z, produit quelque chose

        Consumer<Integer> c = (Integer i) -> {
            System.out.println(i);
        }; // accpet() f(Z) = {}, consomme quelque chose

        A f = () ->1; // A est une interface fonctionnelle... pourquoi?
        //B f2 = () ->1; // B ne l'est pas... pourquoi ?

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
    static public class Chainon {
        public Chainon suivant;
        public int valeur;

        public boolean aSuivant() {
        // Todo
           return this.suivant != null;
        }

        public int somme(int depuis) {
        // Todo : en utilisant somme(indice, depuis)
           return somme(0, depuis);
        }

        private int somme(int indice, int depuis) {
            int resultat = this.valeur;
            if (this.aSuivant()) {
                if (indice == depuis)
                    resultat = this.valeur + suivant.somme(indice + 1, depuis);
                else
                    resultat = suivant.somme(indice +1, depuis);
            }
           return resultat;
        }

        private Chainon inverser() {
            if (aSuivant()) {
                Chainon res = suivant.inverser();
                Chainon temp = res;
                while(temp.aSuivant()) {
                    temp = temp.suivant;
                }
                temp.suivant = new Chainon();
                temp.suivant.valeur = this.valeur;
                return res;
            }
            Chainon nouveau =  new Chainon();
            nouveau.valeur = this.valeur;
            return nouveau;
        }

        public void parcourir(Consumer<Integer> i) {
            i.accept(this.valeur);
            if (this.aSuivant()) {
                suivant.parcourir(i);
            }
        }
    }
}
