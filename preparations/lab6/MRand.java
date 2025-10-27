package preparations.lab6;

import java.util.function.Supplier;

public class MRand implements Supplier<Integer> {
    private int borneSuperieure = 0;
    private long x = 0;
    private static final long M = 0x1000_0000_0000L;
    private static final long A = 0x5_DEEC_E66DL;
    private static final long C = 11L;
    private static final long MASK = 0x0000_7FFF_FFFF_0000L;
    private static final int DEC = 16;

    public MRand() {
        // comme super();
        this(Integer.MAX_VALUE);
    }

    public MRand(int superieur) {
        this.borneSuperieure = superieur;
    }

    public Integer get() {
        long i  = (x = A * x + C) % M;

        return ( (int)(( x & MASK ) >> DEC ) ) % borneSuperieure;
    }
}
