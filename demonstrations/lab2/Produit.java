package demonstrations.lab2;

public class Produit {
    protected double prix;
    private String nom;

    public Produit(String nom, double prix){
        this.nom = nom;
        this.prix = prix;
    }

    public double getPrix() {
        return this.prix;
    }
    public double prix() {
        // throw new RuntimeException("message");
        return 0.0;
    }
}
