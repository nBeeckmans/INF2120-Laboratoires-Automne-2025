package preparations.lab9.StructuresDeDonnees;

public class PileInt {
    private TableauInt tab = new TableauInt(10);

    public PileInt() {
    }


    public PileInt(int tailleInitiale) {
        this.tab = new TableauInt(tailleInitiale);
    }

    public void empiler(int valeur) {
        this.tab.ajouterFin(valeur);
    }

    public int depiler() {
        int valeur = this.tete();
        this.tab.enleverFin();
        return valeur;
    }

    public int tete(){
        return this.tab.getDernier();
    }

    public boolean estVide() {
        return this.tab.estVide();
    }

    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append(this.tab.toString());
       sb.append("<-- tete");
       return sb.toString();
    }
}
