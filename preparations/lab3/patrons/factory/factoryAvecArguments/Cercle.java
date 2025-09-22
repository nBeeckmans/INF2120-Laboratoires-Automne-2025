package preparations.lab3.patrons.factory.factoryAvecArguments;

public class Cercle extends Forme2D {
    private double rayon;

    public Cercle (double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double aire() {
        return this.rayon * this.rayon * Math.PI;
    }

    @Override
    public String toString(){
        return String.format("Cercle de rayon : %f et d'aire : %f", rayon, this.aire());
    }
}
