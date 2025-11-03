package preparations.lab7;

public class StructureRecursive {
    public int valeur;
    public StructureRecursive quelqueChose;
    public StructureRecursive(int valeur){
        this.valeur = valeur;
    }

    public void ajouterEnfant(StructureRecursive rec) {
        if (this.aEnfant()) {
            quelqueChose.ajouterEnfant(rec);
        }
        this.quelqueChose = rec;
    }

    public boolean aEnfant() {
        return null != quelqueChose;
    }

    public void print() {
        System.out.print(valeur);
        if (this.aEnfant()) {
            System.out.print(", ");
            this.quelqueChose.print();
        }
    }
}
