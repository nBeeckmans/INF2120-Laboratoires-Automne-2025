package demonstrations.lab6;

import java.util.function.Supplier;

/**
 * Par Frédérique Desrosiers
 */
public class MRand implements Supplier<Integer> {

    private int borneSuperieure = Integer.MAX_VALUE;
    private long X = 0;

    protected static final long M = 0x1000_0000_0000L;
    protected static final long A = 0x5_DEEC_E66DL;
    protected static final long C = 11L;

    protected static final long MASK = 0x0000_7FFF_FFFF_0000L;
    protected static final int DEC = 16;

    public MRand(){

    }

    public MRand(int borneSuperieure) throws Exception {
        if (borneSuperieure > 0) {
            this.borneSuperieure = borneSuperieure;
        } else {
            throw new Exception("mauvaise valeur");
        }
    }

    @Override
    public Integer get(){
        X = (A * X + C);
        long modulo = X % M;

        return (((int)((modulo & MASK) >> DEC)) % borneSuperieure);
    }

}
