package demonstrations.lab9;

public  class TableauInt {
    private int[] tableau = new int[10];
    private int tailleCourrante;

    public TableauInt() {

    }

    public TableauInt(int tailleInitiale) {
        this. tableau = new int[tailleInitiale];
    }

    public void inserer(int valeur) {
        if (tailleCourrante == tableau.length){
            grandir();
        }
        tableau[tailleCourrante++] = valeur;
    }

    public void grandir() {
        int[] nouveau = new int [tableau.length * 2];
        for (int i = 0; i < tableau.length; ++i) {
            nouveau[i] = tableau[i];
        }
        tableau = nouveau;
    }

    public int get(int position) {
        if (position < 0 || position >= this.tailleCourrante) {
            throw new RuntimeException("wtf");
        }
        return this.tableau[position];
    }

    public void enleverDernier() {
        if (estVide()){
            throw new RuntimeException("wtf");
        }
        this.tailleCourrante--;
    }

    public boolean estVide() {
        return this.tailleCourrante == 0;
    }

    public void ajouter(int valeur, int position) {
       // pass
    }

    public void enlever(int position) {
       // pass
    }


    public void enleverPremier(int position) {
        enlever(0);
    }


    public void ajouterPremier(int valeur) {
        ajouter(valeur, 0);
    }
}
