
package demonstrations.lab2;

public class Facture {
  private static final int TAILLE_MAX = 30;
  private Produit[] produits = new Produit[TAILLE_MAX];
  private int produitsTaille = 0;

    public void ajouterNonTaxable(NonTaxable nonTaxable) {
        if (this.produitsTaille >= this.produits.length) {
            throw new RuntimeException();
        }
      this.produits[this.produitsTaille] = nonTaxable;
      this.produitsTaille++;
    }

    public void ajouterTaxeSimple( TaxeSimple taxeSimple ) {
        if (this.produitsTaille >= this.produits.length) {
            throw new RuntimeException();
        }
      this.produits[this.produitsTaille] = taxeSimple;
      this.produitsTaille++;

    }

  public void ajouterProduit( Produit produit ) {
        if (this.produitsTaille >= this.produits.length) {
            throw new RuntimeException();
        }
      this.produits[this.produitsTaille] = produit;
      this.produitsTaille++;

    }

    public double prixTotal() {
      double total = 0;

      for( int i =0; i < this.produitsTaille; ++i ) {
        Produit produit = this.produits[i];
        total += produit.prix();
      }
      return total;
    }

}
