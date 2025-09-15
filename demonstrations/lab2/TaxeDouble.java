
package demonstrations.lab2;

public class TaxeDouble extends Produit{
    private static double TAXE = 1.09975;

    public TaxeDouble(String nom, double prix) {
        super(nom, prix);
    }

    public double prix() {
        return this.prix * TAXE;
    }
}
