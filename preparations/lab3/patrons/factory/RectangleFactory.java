package preparations.lab3.patrons.factory;

public class RectangleFactory extends Forme2DFactory {
    private static final double LONGUEUR = 2.0;
    private static final double LARGEUR = 1.0;

    @Override
    public Forme2D build() {
        return new Rectangle(LONGUEUR, LARGEUR);
    }
}
