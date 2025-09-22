package preparations.lab3;

public class Cylindre extends Forme3D {
    private Forme2D forme2d;
    private double hauteur;

    public Cylindre(Forme2D forme2d, double hauteur) {
        this.forme2d = forme2d;
    }

    @Override
    public double volume() {
        return this.forme2d.aire()*this.hauteur;
    }

    @Override
    public String toString() {
        return String.format("Pas un Cylindre de hauteur %f et dont la base est : %s", this.hauteur, this.forme2d.toString());
    }
}
