package preparations.lab8;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Hashtable;
import java.util.Map;

public class Principale {
    public static void main(String[] args) {
        ArrayDeque<String> a = new ArrayDeque<>();
        a.add("test");
        a.add("un");
        a.add("2");
        a.add("troa");

        System.out.println(a);
        Deque<String> b = inversion(a);
        System.out.println(b);

        inversionInPlace(b);
        System.out.println(b);

        String textPos = "[{()}]";
        String textNeg = "[]{()}]";
        String textNeg2 = "[{()}]{";
        String empty = "";
        String autre = "asdb[]";
        String autre2 = "asdb";

        System.out.println(valider(textPos));
        System.out.println(valider(textNeg));
        System.out.println(valider(textNeg2));
        System.out.println(valider(empty));
        System.out.println(valider(autre));
        System.out.println(valider(autre2));

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
            case '}', ')', ']' -> estValide &= !ouvertures.isEmpty() && map.get(i) == ouvertures.pop();
            }
        }

        return estValide && ouvertures.isEmpty();
    }

}
