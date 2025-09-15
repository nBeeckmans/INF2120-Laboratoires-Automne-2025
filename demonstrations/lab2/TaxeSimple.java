package demonstrations.lab2;

public class TaxeSimple  extends Produit{
    private static double TAXE = 1.05;

    public TaxeSimple(String nom, float prix) {
        super(nom, prix);
    }

    public double prix() {
        return this.prix * TAXE;
    }
}
