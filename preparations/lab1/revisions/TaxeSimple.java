package revisions;

public class TaxeSimple {
    private String nom;
    private double prix;
    private static final double TAX = 1.05;

    TaxeSimple(String nom, double prix) {
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
