package demonstrations.lab3;

public class Rectangle extends Forme2D {
    private double longueur, largeur;

    public Rectangle() {
        this.longueur = 0.0;
        this.largeur = 0.0;
    }

    public Rectangle(final double longueur, final double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }


    @Override
    public double aire() {
        return this.longueur * this.largeur;
    }

    @Override
    public String toString(){
        return "Rectangle : " + longueur + ", " + largeur;
    }

}
