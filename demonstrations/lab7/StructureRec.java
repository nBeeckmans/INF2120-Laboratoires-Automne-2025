package demonstrations.lab7;

public class StructureRec {
       StructureRec enfant;
       int valeur;

    public StructureRec(int valeur) {
        this.valeur = valeur;
    }

    private boolean aEnfant() {
        return this.enfant != null;
    }

    public void print() {
        System.out.println(this.valeur);
        if (this.aEnfant()) {
            this.enfant.print();
        }
    }

    public void pour(/*lambda*/) {
        /*lambda.get*/
        if (this.aEnfant()) {
            this.enfant.pour();
        }
    }
}
