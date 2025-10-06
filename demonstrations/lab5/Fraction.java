
package demonstrations.lab5;

public class Fraction implements Nombre<Fraction> {
    private int numerateur, denominateur;

    public Fraction(int numerateur, int denomitateur) {
        this.numerateur = numerateur;
        this.denominateur =denomitateur;
    }

    @Override
    public Fraction add( Fraction autre ) {
        int numerateur = this.numerateur * autre.denominateur
            + this.denominateur * autre.numerateur;
        int denominateur = this.denominateur * autre.denominateur;
        return new Fraction(numerateur, denominateur);
    }

    @Override
    public Fraction sub( Fraction autre ) {
        int numerateur = this.numerateur * autre.denominateur
            - this.denominateur * autre.numerateur;
        int denominateur = this.denominateur * autre.denominateur;
        return new Fraction(numerateur, denominateur);
    }

    @Override
    public Fraction mul( Fraction autre ) {
        int numerateur = this.numerateur * autre.numerateur;
        int denominateur = this.denominateur * autre.denominateur;
        return new Fraction(numerateur, denominateur);
    }


    @Override
    public Fraction div( Fraction autre ) {
        Fraction inverse = new Fraction(autre.denominateur, autre.numerateur);
        return this.mul(inverse);
    }
    @Override
    public String toString() {
        return this.numerateur + "/" + this.denominateur;
    }
}
