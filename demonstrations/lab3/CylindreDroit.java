
package demonstrations.lab3;

public class CylindreDroit extends Forme3D {
    private double hauteur;
    private Forme2D base;


    public CylindreDroit(double hauteur, final Forme2D base) {
        this.hauteur = hauteur;
        this.base = base;
    }

    @Override
    public double volume() {
        return base.aire() * hauteur;
    }

    @Override
    public String toString() {
        return "Cylindre Droit, hauteur : " + hauteur + " base : " + base;
    }

}
