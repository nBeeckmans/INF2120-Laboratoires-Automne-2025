package preparations.lab3.patrons.factory.factoryAvecArguments;

public class CercleFactory extends Forme2DFactory {
    private ArgumentsCercle argumentsCercle;

    public CercleFactory(ArgumentsCercle arguments) {
        this.argumentsCercle = arguments;
    }

    public void setArguments(ArgumentsCercle arguments) {
        this.argumentsCercle = arguments;
    }

    @Override
    public Forme2D build() {
        return new Cercle(this.argumentsCercle.rayon);
    }
}
