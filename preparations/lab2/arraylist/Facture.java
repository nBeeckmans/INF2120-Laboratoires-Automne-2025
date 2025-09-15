package preparations.lab2.arraylist;

public class Facture {
    private final ArrayList arrayList = new ArrayList();

    public void ajouterProduit(Produit produit) {
        arrayList.ajouterProduit(produit);
    }

    public double prixTotal() {
        double total = 0;
        for (Produit produit : this.arrayList.getCopieTousProduits()) {
            total += produit.prix();
        }
        return total;
    }
}
