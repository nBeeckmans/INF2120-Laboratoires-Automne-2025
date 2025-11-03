package demonstrations.lab7;

public class Principale {

    /**
     * TODO:
     * DES BASES :
     *   Factoriel x
     *   Multiplication x
     *   Addtion x
     *   Exponentiation -> multiplication
     *   Fibonnacci x
     *   Ackermann x
     * Cas utiles :
     *   inverser string
     *   structure recursive
     *   Faster-Fibonnacci x
     * Fun :
     *   Hanoi
     */

    // n! = n ( n - 1 )!
    // 0! = 1
    public static long factoriel(int base) {
        if (base < 0) {
            throw new RuntimeException("Mauvais argument");
        }

        return interne_factoriel(base);
    }

    private static long interne_factoriel(int base) {
       return base == 0 ? 1 : base * interne_factoriel(base -1);
    }

    private static boolean afficher1() {
        System.out.println(1);
        return true;
    }

    private static boolean afficher2() {
        System.out.println(2);
        return true;
    }

    private static void afficher() {
        boolean qqcho = afficher1() || afficher2(); //1
        boolean qqch = afficher1() | afficher2(); //1, 2
    }
    private static long fibonnacci(int n) {
        if ( n == 0  || n == 1) {
            return 1;
        }
        long n_1 = fibonnacci(n-1);
        long n_2 = fibonnacci(n-2);
        long resultat = n_1 + n_2;
        return resultat;
    }

    public static int f1( int x, int y ) {
        int r = 0;
        if( x > 0 )
            r = y + f1( x - 1, y );

        return r;
    };

    public static void main(String args[]) {
        //System.out.println( f1( 0, 4 ) );
        //System.out.println( f1( 3, 4 ) );

        //System.out.println(ackermann(2,3));
        //System.out.println(ackermann(3,3));
        //System.out.println(ackermann(4,3));

        //System.out.println(ffib(50));
        //System.out.println(fibonnacci(50));
        String hello = "Hello";
        System.out.println(hello);
        System.out.println(inverser(hello));
    }

    // n * m
    public static long multiplication(long n, long m) {
        if (m == 0) {
            return 0;
        }
        return n + multiplication(n, m -1);
    }

    public static long ackermann(long m, long n) {
        if ( m == 0 )  {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ackermann(m -1, 1);
        } else {
            return ackermann(m -1, ackermann(m, n-1));
        }
    }


    /*
     * m, n -> +1, -1
     * m, n => 0
     */
    public static long addition(long m, long n) {
        if ( n == 0 ) {
            return m;
        }
        return addition(m + 1, n -1);
    }

    public static long ffib(int n) {
        return ffib(n, new Long[n + 1]);
    }

    public static long ffib(int n, Long [] tab) {
        if ( n == 0  || n == 1) {
            return 1;
        }

        if (tab[n] != null) {
            return tab[n];
        }

        long n_1 = ffib(n-1, tab);
        long n_2 = ffib(n-2, tab);
        long resultat = n_1 + n_2;
        tab[n] = resultat;
        return resultat;
    }

    public static String inverser(String entree) {
        if (entree.isEmpty()) {
            return "";
        }

        int indice = entree.length() - 1;
        String sousChaine = entree.substring(0, indice);
        char dernierCaractere = entree.charAt(indice);
        System.out.println(dernierCaractere + " " + sousChaine);
        return dernierCaractere +inverser(sousChaine);
    }
}
