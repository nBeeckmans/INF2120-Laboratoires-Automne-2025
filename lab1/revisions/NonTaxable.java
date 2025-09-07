package revisions;

public class NonTaxable {
    private String nom;
    private double prix;

    NonTaxable(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public double prix() {
        return this.prix;
    }

    public String toString() {
      return String.format("%s : %d", nom, prix);
    }
}
