package preparations.lab2;

public class TaxeDouble extends Produit {
    private String nom;
    private double prix;
    private static final double TAX = 1.09975;

    public TaxeDouble(String nom, double prix) {
        super(nom, prix);
    }

    @Override
    public double prix() {
        return this.prix * TAX;
    }
}
