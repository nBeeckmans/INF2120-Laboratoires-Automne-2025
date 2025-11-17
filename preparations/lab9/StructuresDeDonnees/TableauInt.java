package preparations.lab9.StructuresDeDonnees;

public class TableauInt {
    private int courrant = 0;
    int[] tab = new int[10];

    public TableauInt() {
    }

    public TableauInt(int max) {
        if (max == 0) {
            throw new RuntimeException("what is wrong with you?");
        }
        this.tab = new int[max];
    }

    public void ajouterFin(int valeur) {
        //O(1)
        if (this.estRempli()) {
            this.doubler();
        }
        this.tab[this.courrant++] = valeur;
    }


    public void enleverFin() {
        //O(1)
        if (this.estVide()) {
            throw new RuntimeException("what is wrong with you?");
        }
        this.courrant--;
    }

    public boolean estVide() {
        return this.courrant == 0;
    }

    private boolean estRempli() {
        return this.courrant == this.tab.length;
    }

    private void doubler() {
        int[] temp = this.tab;
        this.tab = new int[this.tab.length * 2];
        for (int i = 0 ; i < temp.length; ++i) {
            this.tab[i] = temp[i];
        }
    }

    public void ajouterDebut(int valeur) {
        // O(n)
        if (this.estRempli()) {
            this.doubler();
        }
        for (int i = 0; i < this.courrant; ++i) {
            this.tab[i+1] = this.tab[i];
        }

        this.tab[0] = valeur;
        this.courrant++;
    }

    public void enleverDebut() {
        // O(n)
        if (this.estVide()) {
            throw new RuntimeException("what is wrong with you?");
        }
        for (int i = 1; i < this.courrant; ++i) {
            this.tab[i-1] = this.tab[i];
        }
        this.courrant--;
    }

    public int get(int position) {
        if (position < 0 || position >= this.courrant) {
            throw new RuntimeException("what is wrong with you?");
        }

        return this.tab[position];
    }


    public int getDernier() {
        return this.get(this.courrant -1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i : this.tab) {
            sb.append(i);
            sb.append(" ");
        }

        sb.append("]");
        return sb.toString();
    }
}
