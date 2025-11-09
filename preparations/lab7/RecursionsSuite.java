package preparations.lab7;

public class RecursionsSuite {

    public static void main(String args[]) {
        String s = "hello";

        System.out.println(inverser(s));

        // crash
        System.out.println(ackermann(3, 10));
        System.out.println(estImpair(5));
        System.out.println(estImpair(4));

        System.out.println(estPair(5));
        System.out.println(estPair(4));

        int tab[] = {0, 15,2,35,1,3,5,6,1,20,345};

        triFusion(0, tab.length, tab);

       for (int i : tab) {
           System.out.println(i);
       }

    }

    public static String inverser(String s) {
        return inverser(s, "");
    }

    private static String inverser(String entree, String sortie) {
        if (entree.equals("")) {
            return sortie;
        }

        return inverser(entree.substring(0, entree.length()-1), sortie + entree.charAt(entree.length()-1));
    }

    public static long ackermann(long m, long n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ackermann(m -1, 1);
        } else {
            return ackermann(m- 1, ackermann(m, n -1));
        }
    }

    public static boolean estPair(int i) {
        if (i == 0)
            return true;

        if (i == 1)
            return false;

        return estImpair(i - 1);
    }

    public static boolean estImpair(int i) {
        if (i == 0)
            return false;

        if (i == 1)
            return true;

        return estPair(i - 1);
    }

    // Ne marche pas lmaooo cuz la fusion est pas une fusion en vrai xdd
    public static void triFusion(int i, int j, int[] tab) {
        if (i == j) {
            return;
        }

        int milieu = (i + j) / 2;

        triFusion(i, milieu, tab);
        triFusion(milieu + 1, j, tab);

        fusion(i, milieu, j, tab);

    }

    public static void fusion(int d, int m, int f, int[] tab) {
        int n1 = m - d + 1;
        int n2 = f - m;

        int tmp1[] = new int[n1];
        int tmp2[] = new int[n2];

        for (int i = 0; i < n1; ++i) {
            tmp1[i] = tab[i + i -1];
        }

        for (int i = 0; i < n1; ++i) {
            tmp2[i] = tab[m + i];
        }


    }

    public static void echanger(int i, int j, int[] tab) {
        int temp = tab[i];
        tab[i] = tab[j];
        tab[j] = temp;
    }
}
