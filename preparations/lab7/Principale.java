package preparations.lab7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Hashtable;
import java.util.Map;

public class Principale {
    public static void main(String[] args) {

    }

    public static <T> Deque<T> inversion(Deque<T> pile) {
        Deque<T> retour = new ArrayDeque<>();
        while (!pile.isEmpty()) retour.push(pile.pop());
        return retour;
    }

    public static <T> void inversionInPlace(Deque<T> pile) {
        Deque<T> list = new ArrayDeque<>();
        while(!pile.isEmpty()) list.addFirst(pile.pop()); // Attention ??
        while(!list.isEmpty()) pile.push(list.removeLast()); // Complexite ??
    }

    public static boolean valider(String chaine) {
        char[] characters = chaine.toCharArray();
        Deque<Character> ouvertures = new ArrayDeque<Character>();
        boolean estValide = true;
        Map<Character, Character> map = new Hashtable<>(); // Assiciation entre char, char -> k, v
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');

        for (char i : characters) {
            switch (i) {
            case '{', '(', '[' -> ouvertures.push(i);
            case '}', ')', ']' -> estValide &= map.get(i) == ouvertures.pop();
            }
        }

        return estValide;
    }

}
