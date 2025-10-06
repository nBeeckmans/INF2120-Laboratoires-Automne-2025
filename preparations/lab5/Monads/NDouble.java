package preparations.lab5.Monads;

public class NDouble implements Nombre<NDouble> {
    private double nombre;
    private boolean isValid = true;

    public NDouble(double n) {
        this.nombre = n;
    }

    @Override
    public NDouble add(NDouble x) {
        if (!x.isValid){
            this.isValid =false;
            return this;
        }
        this.nombre += x.nombre;
        return this;
    }

    @Override
    public NDouble sub(NDouble x) {
        if (!this.isValid || !x.isValid){
            this.isValid =false;
            return this;
        }
        this.nombre -= x.nombre;
        return this;
    }

    @Override
    public NDouble mul(NDouble x) {
        if (!this.isValid || !x.isValid){
            this.isValid =false;
            return this;
        }
        this.nombre *= x.nombre;
        return this;
    }

    @Override
    public NDouble div(NDouble x) {
        if (!this.isValid || !x.isValid){
            this.isValid =false;
            return this;
        }
        if (x.nombre < 1e-6) {
            this.isValid = false;
            return this;
        }
        this.nombre /= x.nombre;
        return this;
    }

    public double getResult() {
        return this.nombre;
    }

    @Override
    public String toString() {
        return Double.toString(nombre);
    }
}
