package demonstrations.lab3;

public class Sphere extends Forme3D {
    private double rayon;

    public Sphere(final double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double volume(){
        return Math.PI * rayon * rayon * rayon * (4.0/3.0);
    }

    @Override
    public String toString() {
            return "Sphere " + rayon;
    }
}
