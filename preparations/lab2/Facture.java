package preparations.lab2;

public class Facture {
    private static final int MAXIMUM_POUR_FACTURE = 30;
    private Produit[] produits = new Produit[MAXIMUM_POUR_FACTURE];
    private int produitsMaximum = MAXIMUM_POUR_FACTURE;
    private int produitsCourrant = 0;

    public void ajouterProduit(Produit produit) {
        if (produitsCourrant > produitsMaximum) {
            // TODO : A gerer
        } else {
            produits[produitsCourrant] = produit;
            produitsCourrant++;
        }
    }

    public double prixTotal() {
        double total = 0;
        for (Produit produit : this.produits) {
            if (produit != null) {
                total += produit.prix();
            }
        }
        return total;
    }
}
