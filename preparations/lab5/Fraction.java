package preparations.lab5;

public class Fraction implements Nombre<Fraction> {
    private int x,y;

    public Fraction(int x, int y) {
        this.x = x;
        this.y = y;
        this.simplifier();
    }

    @Override
    public Fraction add(Fraction autre) {
        int numerator = this.x * autre.y + this.y * autre.x;
        int denometor = this.y * autre.y;
        return new Fraction(numerator, denometor);
    }

    @Override
    public Fraction div(Fraction autre) {
        int x2 = this.x * autre.y;
        int y2 = this.y * autre.x;
        return new Fraction(x2, y2);
    }

    @Override
    public Fraction mul(Fraction autre) {
        int x2 = this.x * autre.x;
        int y2 = this.y * autre.y;
        return new Fraction(x2, y2);
    }

    @Override
    public Fraction sub(Fraction autre) {
        int numerator = this.x * autre.y - this.y * autre.x;
        int denometor = this.y * autre.y;
        return new Fraction(numerator, denometor);
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
