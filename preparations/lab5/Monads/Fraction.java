package preparations.lab5.Monads;


public class Fraction {
    private int x,y;

    public Fraction(int x, int y) {
        this.x = x;
        this.y = y;
        this.simplifier();
    }

    @Override
    public String toString() {
            return String.format("%d / %d", x, y);
    }

    private void simplifier() {
        final int pgcd = pgcd(this.x, this.y);
        this.x /= pgcd;
        this.y /= pgcd;
    }

    private static int pgcd(int a, int b) {
        int min, max, resultat = a;
        if (a < b) {
            min = a;
            max = b;
            resultat = pgcd(max - min, min);
        } else if (a > b) {
            min = b;
            max = a;
            resultat = pgcd(max - min, min);
        }
        return resultat;
    }
}
