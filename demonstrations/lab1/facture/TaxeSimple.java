package demonstrations.lab1.facture;

public class TaxeSimple {
    private String nom;
    private double prix;
    private static double TAXE = 1.05;

    public TaxeSimple(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public double prix() {
        return this.prix * TAXE;
    }
}
