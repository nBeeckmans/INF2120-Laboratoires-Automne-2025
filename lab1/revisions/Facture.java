package revisions;

public class Facture {
    private static final int MAXIMUM_PAR_TABLEAU = 10;
    private NonTaxable[] nonTaxables = new NonTaxable[MAXIMUM_PAR_TABLEAU];
    private int nonTaxablesMaximum = MAXIMUM_PAR_TABLEAU;
    private int nonTaxablesCourrant = 0;
    private TaxeSimple[] taxeSimples = new TaxeSimple[MAXIMUM_PAR_TABLEAU];
    private int taxeSimplesMaximum = MAXIMUM_PAR_TABLEAU;
    private int taxeSimplesCourrant = 0;
    private TaxeDouble[] taxeDoubles = new TaxeDouble[MAXIMUM_PAR_TABLEAU];
    private int taxeDoublesMaximum = MAXIMUM_PAR_TABLEAU;
    private int taxeDoublesCourrant = 0;

    public void ajouterProduitNonTaxable( NonTaxable produit ) {
        this.nonTaxablesCourrant++;
        if( this.nonTaxablesCourrant < this.nonTaxablesMaximum ) {
            this.nonTaxables[nonTaxablesCourrant] = produit;
        } else
            throw new RuntimeException("Impossible d'ajouter plus...");
    }

    public void ajouterProduitTaxeSimple( TaxeSimple produit ) {
        this.taxeSimplesCourrant++;
        if( this.taxeSimplesCourrant < this.taxeSimplesMaximum ) {
            this.taxeSimples[taxeSimplesCourrant] = produit;
        } else
            throw new RuntimeException("Impossible d'ajouter plus...");
    }


    public void ajouterProduitTaxeDouble( TaxeDouble produit ) {
        this.taxeDoublesCourrant++;
        if( this.taxeDoublesCourrant < this.taxeDoublesMaximum ) {
            this.taxeDoubles[this.taxeDoublesCourrant] = produit;
        } else
            throw new RuntimeException("Impossible d'ajouter plus...");

    }


    public double prixTotal() {
        return this.prixNonTaxables() + this.prixTaxeSimple() + this.prixTaxeDouble();
    }

    private double prixNonTaxables() {
        double total = 0;
        for(int i = 0; i < this.nonTaxablesCourrant; ++i) {
            total += this.nonTaxables[i].prix();
        }
        return total;
    }


    private double prixTaxeSimple() {
        double total = 0;
        for(int i = 0; i < this.taxeSimplesCourrant; ++i) {
            total += this.taxeSimples[i].prix();
        }
        return total;
    }


    private double prixTaxeDouble() {
        double total = 0;
        for(int i = 0; i < this.taxeDoublesCourrant; ++i) {
            total += this.taxeDoubles[i].prix();
        }
        return total;
    }
}
