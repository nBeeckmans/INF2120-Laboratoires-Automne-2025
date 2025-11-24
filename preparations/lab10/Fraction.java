package preparations.lab10;
import java.lang.Comparable;

public class Fraction implements Comparable<Fraction> {
    private int num, den;

    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
    }

    @Override
    public int compareTo(Fraction autre) {
        int thisval = this.num * this.den * autre.den;
        int autreval = autre.num * this.den * autre.den;
        return thisval - autreval;
    }

    @Override
    public String toString() {
        return num+"/"+den;
    }

}
