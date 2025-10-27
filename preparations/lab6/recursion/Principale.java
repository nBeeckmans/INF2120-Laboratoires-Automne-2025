package preparations.lab6.recursion;
import java.util.Scanner;


interface Lambda {
    void exec ();
}

public class Principale {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String [] args) {
        print("Factoriel de 5", () ->System.out.println( factoriel(5)));
        print("Multiplication 10 par 5", () ->System.out.println( multiplication(10, 5)));
        print("Addtion 10 par 5", () ->System.out.println( addition(10, 5)));
        print("Fibonnacci 50", () ->System.out.println( fibonnacci(50)));
        print("Faster-Fibonnacci 50", () ->System.out.println( ffibonnacci(50)));
        print("Exponentiation 2 5", () ->System.out.println( exponentiation(2, 5)));
        print("Exponentiation 2 6", () ->System.out.println( exponentiation(2, 6)));
        print("hanoi 3",() ->hanoi(3, Position.A, Position.B, Position.C));
        System.out.println("======================================");
        print("hanoi 4",() ->hanoi(4, Position.A, Position.B, Position.C));
    }

    public static void print(String message, Lambda toExecute) {
        System.out.println(message);
        toExecute.exec();
        System.out.println("...");
        scanner.nextLine();
    }

    public static int addition(int a, int b) {
        if (a > 0) {
            return addition(a-1, b + 1);
        }
        return b;
    }

    public static int multiplication(int a, int b) {
        if (b  == 1) {
            return a;
        }
        return multiplication(a, b - 1) + a;
    }

    public static int factoriel(int a) {
        if (a == 0)
            return 1;

        return a * factoriel(a-1);
    }

    public static long ffibonnacci(int a ) {
        return ffibonnacci(a, new long[a]);
    }

    public static long ffibonnacci(int a, long[] tableau) {
        if (a == 0 || a == 1 ) {
            return 1;
        }
        long f_1, f_2;
        if (tableau[a-1] > 0) {
            f_1 = tableau[a-1];
        } else {
            f_1 = ffibonnacci(a - 1, tableau);
            tableau[a-1] = f_1;
        }

        if (tableau[a-2] > 0) {
            f_2 = tableau[a-2];
        } else {
            f_2 = ffibonnacci(a - 2, tableau);
            tableau[a-2] = f_2;
        }
        return f_1 + f_2;
    }

    public static long fibonnacci(int a) {
        if (a <= 1) {
            return 1;
        }
        return fibonnacci(a- 1) + fibonnacci(a- 2);
    }

    public static long somme(int[] tableau) {
        return somme(tableau, 0);
    }

    public static long somme(int[] tableau, int indice) {
        if (indice == tableau.length) {
            return 0;
        }

        return tableau[indice] + somme(tableau, indice + 1);
    }

    public static long sommeAccumulateur(int[] tableau) {
        return somme(tableau, 0, 0);
    }

    public static long somme(int[] tableau, int indice, int accumulateur) {
        if (indice == tableau.length) {
            return accumulateur;
        }

        return somme(tableau, indice + 1, accumulateur +tableau[indice]);
    }

    enum Position {
        A("A"),
        B("B"),
        C("C");

        public String nom;
        Position(String s) {
            this.nom = s;
        }
    }

    public static void hanoi(int nombreTours, Position origine, Position vide, Position destination) {
        if (nombreTours == 1) {
           System.out.println("Deplacement de : "  + origine.nom + " a " + destination.nom);
           return;
        }
        hanoi(nombreTours - 1, origine, destination, vide);
        hanoi(1, origine, vide, destination);
        hanoi(nombreTours - 1, vide, origine, destination);
    }

    public static long exponentiation(int a, int b) {
        // Cas de base :
        if (b == 0)
            return 1;

        if (b == 1)
            return a;

        // b / 2  => on divise par 2 le nombre de multiplications => on passe en O(log(n))
        long x = exponentiation(a, b / 2);
        if ( b % 2 == 0 ) {
            return x * x;
        } else {
            return a * x * x;
        }
    }
}
