public class File<T> {
    /**
     * Il y a 2 types de classes imbriquées
     *       - Les classes imbriquées static
     *       - Les classes imbriquées non static
     *
     * Les classes imbriquées non static on besoin d'une instance
     * de la classe qui la contient pour pouvoir être instanciées.
     *     Vous ne pouvez pas créer une instance de la classe imbriquée
     *     sans avoir une instance de la classe qui la contient
     *
     * Les classes imbriquées static n'ont pas besoin d'une instance
     * de la classe qui la contient pour pouvoir être instanciées.
     *      Vous pouvez créer une instance de la classe imbriquée
     *      sans avoir besoin d'une instance qui la contient.
     * Voir le pdf
     */
    private static class Noeud<T>{
        T valeur;
        Noeud<T> suivant;
        Noeud(T valeur){
            this.valeur = valeur;
            this.suivant = null;
        }
    }

    private Noeud<T> premier;
    private Noeud<T> dernier;

    // Nécessaire pour réduire la complexité temporelle
    // de calcul de la taille
    private int taille;


    public File(){
        // Équivalent à
        // premier = null;
        // dernier = null;
        // taille = 0;
    }
    public int taille(){
        return taille;
    }

    public boolean estVide(){
        return taille == 0;
    }

    // Tete retourne l'élément qui serait défiler
    // sans l'enlever de la file
    // ici, premier est le premier a avoir été ajouté et donc
    // le premier a etre enlevé
    public T tete(){
        if (estVide()){
            throw new FileVide("La file est vide");
        }
        return premier.valeur;
    }

    // On enfile à la fin de la file
    // c'est à dire qu'on commence par le dernier Noeud/chainon
    public void enfiler(T a_element){
        // Si la file est vide, l'élément est le premier et le dernier
        // le suivant reste null
        if (estVide()){
            premier = new Noeud<T>(a_element);
            dernier = premier;
        } else {
            // sinon, on met a jour le dernier ayant été ajouté
            // tout en prenant soit de lié le dernier au nouveau dernier
            dernier.suivant = new Noeud<T>(a_element);
            dernier = dernier.suivant;
        }
        // on met a jour la taille sinon on devra parcourir la liste
        // au complet pour avoir la taille si on ne garde pas de variable taille
        ++taille;
    }
    // lorsqu'on défile, on prend le premier element a
    // avoir été enfilé, on le retourne et on l'enlève
    public T defiler() throws FileVide {
        T valRetour;
        if (estVide()){
            throw new FileVide("La file est vide");
        } else if (taille == 1){
            valRetour = premier.valeur;
            premier = null;
            dernier = null;
        } else {
            valRetour = premier.valeur;
            // celui ajouté après le premier est
            // maintenant le premier
            premier = premier.suivant;
        }
        --taille;
        return valRetour;
    }
}
