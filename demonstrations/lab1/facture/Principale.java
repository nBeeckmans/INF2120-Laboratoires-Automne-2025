package demonstrations.lab1.facture;

public class Principale {
    public static void main(String[]args) {
      Facture f = new Facture();

      NonTaxable nt = new NonTaxable("nom", 1);
      NonTaxable st = new NonTaxable("nom2", 2);

      f.ajouterNonTaxable(nt);
      f.ajouterNonTaxable(st);

      System.out.println(f.prixTotal());
    }
}
