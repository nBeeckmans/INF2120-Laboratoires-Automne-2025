package demonstrations.lab10;

public class Fraction implements Comparable<Fraction> {
    private int num;
    private int den;

    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
    }

    @Override
    public String toString() {
        return num + "/" + den;
    }

    //@Override
    //public int compareTo(Fraction autre) {
        //assert this.den != 0;
        //assert autre.den != 0;
//
        //double thisValeur = ((double)this.num) / this.den;
        //double autreValeur = ((double)autre.num) / autre.den;
        //double resultat = (thisValeur - autreValeur);
        //double seuil = 1e-6;
        //resultat = Math.abs(resultat) > seuil ? resultat: 0;
//
        //return (int)(thisValeur - autreValeur);
    //}

    @Override
    public int compareTo(Fraction autre) {
        assert this.den != 0;
        assert autre.den != 0;

        int thisnum = this.num * autre.den;
        int autrenum = autre.num * this.den;
        return thisnum - autrenum;
    }
}
