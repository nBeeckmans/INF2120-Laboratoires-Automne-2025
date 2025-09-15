package demonstrations.lab1.facture;

public class NonTaxable {
    private String nom;
    private float prix;

    public NonTaxable(String nom, float prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public double prix() {
        return this.prix;
    }
}
