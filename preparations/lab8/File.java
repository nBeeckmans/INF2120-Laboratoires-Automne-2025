package preparations.lab8;

public class File<T> {
    private Noeud<T> premier;
    private Noeud<T> dernier;
    private int taille;

    public File() {
    }
    public int taille() {
        // O(n)
        int i = 0;
        Noeud<T> n = this.dernier;
        while(n != null) {
            n = n.precedent;
            ++i;
        }
        return i;
        // 0(1) mais necessite de faire attention a ca :P
        // return taille;
    }
    public boolean estVide() {
        // return this.dernier == null; si on utilise la version d'en haut :D
        return taille == 0;
    }
    public T tete() throws Exception {
        if (this.estVide()) {
            throw new Exception("File vide");
        }

        return dernier.element;
    }
    public void enfiler( T a_element) {
        Noeud<T> nouveau = new Noeud<T>(a_element);
        this.premier.precedent = nouveau;
        this.premier = nouveau;
        if(this.estVide()) {
            this.dernier = nouveau;
        }
        this.taille++;
    }
    public T defiler() throws Exception {
        if (this.estVide()) {
            throw new Exception("File vide");
        }
        T element = this.dernier.element;
        this.dernier = this.dernier.precedent;
        this.taille--;
        if (this.estVide()) {
            this.premier = this.dernier;
        }
        return element;
    }

    private class Noeud<T> {
        public T element;
        public Noeud<T> precedent;

        private Noeud(T element) {
            this.element = element;
        }
    }
}
