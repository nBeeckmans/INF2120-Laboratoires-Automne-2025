package preparations.lab2.arraylist;

public class TaxeSimple extends Produit {
    private String nom;
    private double prix;
    private static final double TAX = 1.05;

    public TaxeSimple(String nom, double prix) {
        super(nom, prix);
    }

    @Override
    public double prix() {
        return this.prix * TAX;
    }

}
