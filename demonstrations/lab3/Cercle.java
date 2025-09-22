package demonstrations.lab3;

public class Cercle extends Forme2D {

    private double rayon;

    public Cercle(final double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double aire() {
        //return Math.PI * Math.pow(rayon, 2);
        return Math.PI * rayon * rayon;
    }

    @Override
    public String toString() {
        return "Ceci n'est pas un Cercle de rayon " + rayon;
    }
}
