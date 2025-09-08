package demonstrations.lab1.couleurs;

public class Principale {
    public static void main(String [] arguments) {
        Couleur c1 = new Couleur( 1, 200, 6 );
        Couleur c2 = c1;
        System.out.println( c2 );
        try {
            c2.setRouge( 100 );
        } catch( Exception e ) {
            // TODO : a gerer
        }
        System.out.println( c1);

    }
}
