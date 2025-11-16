import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        /*
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.push(1);
        arrayDeque.push(2);
        arrayDeque.push(3);
        arrayDeque.push(4);
        System.out.println(arrayDeque);
        //System.out.println(inverserNouvelle(arrayDeque));
        System.out.println(inverser(arrayDeque));
        System.out.println(arrayDeque); */
        String basiqueSucces = "[{{}}](){}({})";
        System.out.println(validerChaine(basiqueSucces));

        String basiqueEchec = "[{{}}](){}({}))";
        System.out.println(validerChaine(basiqueEchec));

        String autreChar = "[{{g35y5445}}ggferf](){rgegeger}(uhfhfhwe{})";
        System.out.println(validerChaine(autreChar));

        File<Integer> file = new File<>();
        for (int i = 0; file.taille() < 10; i++) {
            file.enfiler(i+20);
        }
        while (!file.estVide()) {
            System.out.println(file.defiler());
        }
    }

    public static <T> Deque<T> inverserNouvelle(Deque<T> pile) {
        ArrayDeque<T> res = new ArrayDeque<>();
        int taille = pile.size();
        for (int i = 0; i < taille; i++) {
            T element = pile.pop();
            res.push(element);
        }

        return res;
    }

    public static <T> Deque<T> inverser(Deque<T> pile){
        Deque<T> temp = inverserNouvelle(pile);
        Deque<T> res = inverserNouvelle(temp);

        int taille = res.size();
        for (int i = 0; i < taille; i++) {
            pile.push(res.pop());
        }
       // return inverserNouvelle(res);
        return pile;
    }

    public static <T> Deque<T> inverserMeme(Deque<T> pile) {
        ArrayDeque<T> tempUn = new ArrayDeque<>();
        ArrayDeque<T> tempDeux = new ArrayDeque<>();;
        int taille = pile.size();
        for (int i = 0; i < taille; i++) {
            T element = pile.pop();
            tempUn.push(element);
        }

        for (int i = 0; i < taille; i++) {
            tempDeux.push(tempUn.pop());
        }

        for (int i = 0; i < taille; i++) {
            pile.push(tempDeux.pop());
        }
        return pile;
    }

    public static boolean validerChaine(String chaine){
        ArrayDeque<Character> pile = new ArrayDeque<>();
        boolean resultat = true;
        int i = 0;

        while(i < chaine.length() && resultat){
            char aTester = chaine.charAt(i);
            if (aTester == '(' || aTester == '[' || aTester == '{') {
                pile.push(aTester);
            } else if (aTester == ')') {
                if (!pile.isEmpty() &&  pile.peek() == '(') {
                    pile.pop();
                } else {
                    resultat = false;
                }
            } else if (aTester == ']') {
                if (!pile.isEmpty() &&  pile.peek() == '[') {
                    pile.pop();
                }  else {
                    resultat = false;
                }
            } else if (aTester == '}') {
                if (!pile.isEmpty() &&  pile.peek() == '{') {
                    pile.pop();
                } else  {
                    resultat = false;
                }
            }
            i++;
        }
        return resultat;
    }





}