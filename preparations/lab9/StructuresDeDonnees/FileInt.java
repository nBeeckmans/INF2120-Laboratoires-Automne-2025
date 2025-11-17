package preparations.lab9.StructuresDeDonnees;

public class FileInt {
    private PileInt tete = new PileInt(10);
    private PileInt queue = new PileInt(10);

    public FileInt() {
    }

    public FileInt(int tailleInitiale) {
        // Sincerement... pas de bonne facon de le faire...
        this(tailleInitiale, tailleInitiale);
    }

    public FileInt(int tailleTete, int tailleQueue) {
        // Sincerement... pas de bonne facon de le faire...
        this.tete = new PileInt(tailleTete);
        this.queue = new PileInt(tailleQueue);
    }

    public void enfiler(int valeur) {
        this.queue.empiler(valeur);
    }

    public int defiler() {
        if (this.estVide()) {
            throw new RuntimeException("????");
        }

        if (this.tete.estVide()) {
            this.transfere();
        }
        return this.tete.depiler();
    }

    public int tete(){
        return this.tete.tete();

    }

    public boolean estVide() {
        return this.tete.estVide() && this.queue.estVide();
    }

    // public si on trust nos utilisateurs :P
    // private sinon...
    public void transfere() {
        while(!this.queue.estVide()) {
            this.tete.empiler(this.queue.depiler());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(this.tete);
        sb.append("] tete\n");
        sb.append("[");
        sb.append(this.queue);
        sb.append("] queue");
        return sb.toString();
    }
}
