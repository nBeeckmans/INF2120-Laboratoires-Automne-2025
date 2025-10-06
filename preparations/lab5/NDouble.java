package preparations.lab5;

public class NDouble implements Nombre<NDouble> {
    private double nombre;

    public NDouble(double n) {
        this.nombre = n;
    }


    @Override
    public NDouble add(NDouble x) {
        this.nombre += x.nombre;
        return this;
    }

    @Override
    public NDouble sub(NDouble x) {
        this.nombre -= x.nombre;
        return this;
    }

    @Override
    public NDouble mul(NDouble x) {
        this.nombre *= x.nombre;
        return this;
    }

    @Override
    public NDouble div(NDouble x) {
        this.nombre /= x.nombre;
        return this;
    }

    @Override
    public String toString() {
        return Double.toString(nombre);
    }
}
