package revisions;

public class TaxeDouble {
    private String nom;
    private double prix;
    private static final double TAX = 1.09975;

    TaxeDouble(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public double prix() {
        return this.prix * TAX;
    }

    public String toString() {
      return String.format("%s : %d", nom, prix);
    }
}
