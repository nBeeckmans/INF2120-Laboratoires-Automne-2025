package preparations.lab2.final;

public class Principale {
    public static void main(String[] args) {
        //final int i = 0;
        // i = 1; pas ok

        final Conteneur  o = new Conteneur(); // protege juste le pointeur
        o.i = 1; // ok
        // o = null; pas ok

        Examen ex = new Rattrapage();

        int j =2;
        switch(j) {
            case 2 -> {System.out.println();}

        }

        switch(ex) {
            case Rattrapage r -> System.out.println(r.s());
            case Intra i -> System.out.println(i.d());
            case Final f -> System.out.println(f.l());
            case Examen e -> System.out.println(e.i());
        }


    }
}
// Classe de portee package
class Conteneur {
    public int i = 0;
}

// ====================================================
// final
class Parent {
    public void methode() {
       System.out.println("?");
    }

    final public void methodeImportante() {
       System.out.println("!");
    }

    public void autreMethode(final Conteneur c) {
      // c = null; pas ok
    }
}

class Enfant extends Parent {

    @Override
    public void methode() {
       System.out.println("?");
    }

    //@Override
    //public void methodeImportante() {
    // pas legal
    //}
}

final class Hermite {

}

// class Impossible extends Hermite {
//
// }

// fin final
// ====================================================
// record
final class Point {
    private final int x;
    private final int y;
    private final int z;

    public Point(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
}

record PointR(int x, int y, int z) {
    public int distanceTchebytchev(PointR autre) {
        final int x = Math.abs(this.x - autre.x);
        final int y = Math.abs(this.y - autre.y);
        final int z = Math.abs(this.z - autre.z);
        return Math.max(Math.max(x,y),z);
    }
}

// Fin Record
// ====================================================
// Sealed

sealed class Examen permits Intra, Final {
    public int i() {
       return 42;
    }
}

sealed class Intra extends Examen permits Rattrapage {
    public double d() {
        return 3.141592658;
    }

}

final class Rattrapage extends Intra {
    public String s() {
        return "bonjour";
    }

}

final class Final extends Examen {
    public long l() {
        return 1;
    }

}

// Fin Sealed
// ====================================================
// Enum

// Je laisse Bruno en parler en cours
// mais remplace bien les Object final static

// Fin Enum
// ====================================================
