package demonstrations.lab3;

public class Principale {
    public static void main(String[] args) {
      Forme2D forme2d = new Cercle(2);
      Forme3D forme3d = new CylindreDroit(5, forme2d);

      System.out.println(forme3d);
      System.out.println(forme3d.volume());
    }
}
