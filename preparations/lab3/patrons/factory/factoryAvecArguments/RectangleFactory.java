package preparations.lab3.patrons.factory.factoryAvecArguments;

public class RectangleFactory extends Forme2DFactory {

    private ArgumentsRectangle argumentsRectangle;

    public RectangleFactory(ArgumentsRectangle argumentsRectangle) {
        this.argumentsRectangle = argumentsRectangle;
    }

    public void setArguments(ArgumentsRectangle argumentsRectangle) {
        this.argumentsRectangle = argumentsRectangle;
    }

    @Override
    public Forme2D build() {
        return new Rectangle(argumentsRectangle.longueur, argumentsRectangle.largeur);
    }
}
