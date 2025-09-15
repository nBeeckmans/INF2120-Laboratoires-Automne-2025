package preparations.lab2.arraylist;

public class ArrayList {
    private final int TAILLE_INITIALE = 10;
    private final int FACTEUR_DE_CROISSANCE = 2;
    private Produit[] produits ;
    private int nombreProduitsCourrant = 0;


    public ArrayList() {
       this.produits = new Produit[TAILLE_INITIALE];
    }

    public ArrayList(int taille) {
       this.produits = new Produit[taille];
    }

    public void ajouterProduit(Produit produit) {
        if (nombreProduitsCourrant > produits.length) {
            this.agrandirTableauPar(FACTEUR_DE_CROISSANCE);
        } else {
            produits[nombreProduitsCourrant] = produit;
            nombreProduitsCourrant++;
        }
    }

    public void creerProduit(String nom, double prix) {
        this.ajouterProduit(new Produit(nom, prix));
    }

    private void agrandirTableauPar(int facteurDeCroissance) {
        final int nouvelleTaille = produits.length * facteurDeCroissance;
        final Produit[] referenceAncienTableau = this.produits;
        this.produits = new Produit[nouvelleTaille];
        int indice = 0;
        for (Produit produit : referenceAncienTableau) {
            this.produits[indice] = produit;
            ++indice;
        }
    }

    public Produit getProduit(int position) {
        Produit aRetourner = null;
        if (this.estPositionValide(position)) {
            aRetourner = this.produits[position];
        }
        return aRetourner;
    }

    public void enlever(int position) {
        if (estPositionValide(position)) {
            --this.nombreProduitsCourrant;
            for (int i = this.nombreProduitsCourrant; i > position; --i) {
                this.produits[i - 1] = this.produits[i];
            }
        }
    }

    private boolean estPositionValide(int position) {
        return position >= 0 && position < nombreProduitsCourrant;
    }

    public void enlever(Produit produit) {
        final int position = this.trouver(produit);
        this.enlever(position);
    }

    public int trouver(Produit produit) {
        int i = 0;
        while (i < this.nombreProduitsCourrant && this.produits[i] != produit) {
            ++i;
        }
        return i == this.nombreProduitsCourrant ? -1 : i;
    }

    public Produit[] getCopieTousProduits(){
        final Produit[] produits = new Produit[this.nombreProduitsCourrant];
        for (int i = 0; i < this.nombreProduitsCourrant; ++i) {
            produits[i] = this.produits[i];
        }
        return produits;
    }
}
