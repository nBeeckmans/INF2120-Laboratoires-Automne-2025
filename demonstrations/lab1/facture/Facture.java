package demonstrations.lab1.facture;

public class Facture {
  private NonTaxable[] nonTaxables = new NonTaxable[10];
  private TaxeSimple[] taxeSimples = new TaxeSimple[10];
  private int taxeSimpleTaille = 0;
  private TaxeDouble[] taxeDoubles = new TaxeDouble[10];

    public void ajouterNonTaxable(NonTaxable nonTaxable) {
        NonTaxable temporaire = this.nonTaxables[0];
        int i = 0;
        while(temporaire != null && i < nonTaxables.length) {
            ++i;
            temporaire = this.nonTaxables[i];
        }

        if (i < nonTaxables.length) {
            this.nonTaxables[i] = nonTaxable;
        } else {
            // on fait quoi ^^
        }

    }

    public void ajouterTaxeSimple( TaxeSimple taxeSimple ) {
        if (this.taxeSimpleTaille >= this.taxeSimples.length) {
            throw new RuntimeException();
        }
      this.taxeSimples[this.taxeSimpleTaille] = taxeSimple;
      this.taxeSimpleTaille++;
    }


    public float prixTotal() {
      return this.prixTotalNonTaxable() + this.prixTotalTaxeSimple() ;//+ this.prixTotalTaxeDouble();
    }

    private float prixTotalNonTaxable() {
      float total = 0;
      for (NonTaxable nonTaxable: this.nonTaxables ){
        if (nonTaxable != null)  {
            total += nonTaxable.prix();
            // total = total + nonTaxable.prix();
        }
      }

      System.out.println(total);
      return total;
    }

    private float prixTotalTaxeSimple() {
      float total = 0;
      for (int i =0; i < this.taxeSimpleTaille; ++i ){
        TaxeSimple taxeSimple = this.taxeSimples[i];
        total += taxeSimple.prix();
      }

      System.out.println(total);
      return total;
    }
}
