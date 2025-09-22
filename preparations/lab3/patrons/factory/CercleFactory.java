package preparations.lab3.patrons.factory;

public class CercleFactory extends Forme2DFactory {
    private static double RAYON = 1.0;

    @Override
    public Forme2D build() {
        return new Cercle(RAYON);
    }
}
