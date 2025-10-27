package preparations.lab6;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import preparations.lab5.Fraction;

public class Principale {
    public static void main(String[] args) {
        MRand mRand = new MRand(100);
        int[] tableau = new int[100];

        for (int i = 0; i < 1_000_000; ++i) {
            tableau[mRand.get()]++;
        }

        for (int i : tableau) {
            System.out.print(i + " ");
        }

        Function <ArrayList<String>, String> f = (ArrayList<String> arg0) -> {
            String toBuild = "";
            for (int i = 0; i < (arg0.size() -1);i++) {
                toBuild += arg0.get(i) + ", ";
            }
            toBuild += arg0.getLast();
            return toBuild;
        };
        ArrayList<Fraction> aF = new ArrayList<>();
        Consumer<Fraction> c = (Fraction arg0) ->
            {
               arg0.x = arg0.y * 2;
            };

        aF.forEach(c);

        Predicate<Integer> p = (Integer arg0) -> {
            return arg0 < 4;
        };

        ArrayList<Integer> aI = new ArrayList<>();
        aI.removeIf(p);


    }

}
