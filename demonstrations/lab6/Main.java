package demonstrations.lab6;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Par Frédérique Desrosiers
 */
public class Main {
    public static void main(String[] args) throws Exception {
        MRand mrand = new MRand(100);
        a_1_4(mrand);

        //5.2.1
        Function<ArrayList<String>,String> concatenation = (ArrayList<String> a) -> {
            String retour = "";
            for (int i =0; i < a.size(); i++){
                if (i ==  0) {
                    retour = retour + a.get(i);
                } else {
                    retour = retour + " , " + a.get(i);
                }

            }
            return retour;
        };

        ArrayList<String> listeChaine = new ArrayList<>();
        String un = "Bonjour";
        String deux = "Hello";
        String trois = "aurevoir";
        String quatre = "bye bye";

        listeChaine.add(un);
        listeChaine.add(deux);
        listeChaine.add(trois);
        listeChaine.add(quatre);
        System.out.println(concatenation.apply(listeChaine));


        //5.2.2
        ArrayList<Fraction> fractions = new ArrayList<>();
        fractions.add(new Fraction(5,7));
        fractions.add(new Fraction(10,2));
        fractions.add(new Fraction(3,2));
        fractions.add(new Fraction(15,8));

        fractions.forEach(System.out::println);

        Consumer<Fraction> FONCTION = (Fraction f) -> f.setNum(f.getNum()*2);
        fractions.forEach(FONCTION);

        System.out.println("MULTIPLICATIONS APRES");
        fractions.forEach(System.out::println);

        // 5.2.3
        MRand deuxieme = new MRand(10);
        ArrayList<Integer> liste = new ArrayList<>(30);
        for (int i = 0; i < 30; i++){
            liste.add(deuxieme.get());
        }
        System.out.println("Avant remove if");
        liste.forEach(System.out::println);
        System.out.println("Après remove if");
        liste.removeIf(element -> element < 4);
        liste.forEach(System.out::println);
        System.out.println(liste.size());

    }

    public static void a_1_4(Supplier<Integer> mrand){
        int []  valeurs = new int[100];
        for (int i = 0; i < 1_000_000; i++){
            valeurs[mrand.get()]++;
        }
        for (int i = 0; i < valeurs.length; i++){
            System.out.println(i + " nb occurences: " + valeurs[i]);
        }
    }


}
