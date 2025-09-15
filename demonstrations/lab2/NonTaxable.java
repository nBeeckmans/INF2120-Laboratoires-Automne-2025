
package demonstrations.lab2;

public class NonTaxable extends Produit {

    public NonTaxable(String nom, float prix) {
        super(nom, prix);
    }

    public double prix() {
        return this.getPrix();
    }
}
