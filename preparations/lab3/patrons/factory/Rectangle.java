package preparations.lab3.patrons.factory;

public class Rectangle extends Forme2D {
    private double longueur, largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;

    }

    @Override
    public double aire() {
        return this.longueur * this.largeur;
    }

    @Override
    public String toString() {
        return String.format("Cercle de longueur : %f et de largeur : %f", this.longueur, this.largeur);
    }
}
