package preparations.lab3;

public class Sphere extends Forme3D {
    private double rayon;
   public Sphere(double rayon){

   }

    @Override
    public double volume() {
        return Math.pow(this.rayon, 3) * Math.PI * 4.0 / 3.0;
    }

    @Override
    public String toString() {
      return String.format("Ceci n'est pas une Sphere de rayon : %f", this.rayon);
    }
}
