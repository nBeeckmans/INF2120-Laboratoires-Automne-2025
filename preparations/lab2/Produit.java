package preparations.lab2;

public class Produit {
    private String nom;
    private double prix;

    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public double prix() {
        // NOTE : Je prefererais ca pour le moment
        // throw new Error("Prix n'est pas implemente");

        // 0  est de quel type ?
        return 0;
    }

    public String toString() {
      return String.format("%s : %d", nom, prix);
    }
}
