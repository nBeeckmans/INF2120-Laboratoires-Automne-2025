package preparations.lab3;

public class Principale {

    public static void main(String[] args) {

        Forme2D f2d = new Cercle(1);
        Forme3D f3d = new Cylindre(f2d, 2);

        System.out.println(f2d);
        System.out.println(f3d);

        System.out.println(f2d.aire());
        System.out.println(f3d.volume());
    }
}
