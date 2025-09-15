package preparations.lab2.arraylist;

public class NonTaxable extends Produit {
    private String nom;
    private double prix;

    NonTaxable(String nom, double prix) {
        super(nom, prix);
    }

    @Override
    public double prix() {
        return this.prix;
    }

}
