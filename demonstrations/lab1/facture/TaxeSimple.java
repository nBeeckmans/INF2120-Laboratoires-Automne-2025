package demonstrations.lab1.facture;

public class TaxeSimple {
    private String nom;
    private float prix;
    private static double TAXE = 1.05;

    public TaxeSimple(String nom, float prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public double prix() {
        return this.prix * TAXE;
    }
}
