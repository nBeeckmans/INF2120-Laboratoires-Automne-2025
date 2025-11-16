public class ListeChaine<T> {
    Chainon<T> premier;
    int taille;

    public ListeChaine() {
    }

    public ListeChaine(Chainon<T> premier, int taille) {
        this.premier = premier;
        this.taille = taille;
    }

    public int calculerTaille() {
        //return taille;
        int taille = 0;
        Chainon<T> courant = premier;
        while (courant != null) {
            courant = courant.suivant;
            taille++;
        }
        return taille;
    }

    public void ajouterFin(T element) {
        if (premier == null) {
            premier = new Chainon<>(element);

        } else {
            Chainon<T> courant = premier;
            while (courant.suivant != null) {
                courant = courant.suivant;
            }
            courant.suivant = new Chainon<>(element);

        }
        taille++;
    }

    public class Chainon<T> {
        T element;
        Chainon<T> suivant;

        public Chainon(T element) {
            this.element = element;
        }
    }

}