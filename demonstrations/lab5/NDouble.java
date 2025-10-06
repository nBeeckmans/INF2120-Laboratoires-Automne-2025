package demonstrations.lab5;

public class NDouble implements Nombre<NDouble> {
    private double x;

    public NDouble(double x) {
        this.x = x;
    }

    @Override
    public NDouble add( NDouble autre ) {
        Double resultatDouble = this.x + autre.x;
        return new NDouble(resultatDouble);
    }


    @Override
    public NDouble sub( NDouble autre ) {
        Double resultatDouble = this.x - autre.x;
        return new NDouble(resultatDouble);
    }

    @Override
    public NDouble mul( NDouble autre ) {
        Double resultatDouble = this.x * autre.x;
        return new NDouble(resultatDouble);
    }

    @Override
    public NDouble div( NDouble autre ) {
        Double resultatDouble = this.x / autre.x;
        return new NDouble(resultatDouble);
    }

    @Override
    public String toString() {
        return "" + this.x;
    }
}
