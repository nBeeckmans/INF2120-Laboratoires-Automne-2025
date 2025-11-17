package preparations.lab8;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

public class MicroBench {
    interface ToTest {
        void execute();
    }

    public static void main(String[] args){
        Deque<Integer> integers = setUpArrayDeque();
        bench(() -> inversion(integers), "Inversion ");
        integers.clear();
        System.gc();

        Deque<Integer> integers2 = setUpArrayDeque();
        bench(() -> inversionOptimisationTaille(integers2), "Inversion Optimisation de taille ");
        integers2.clear();
        System.gc(); // Invocation du garbage collector... mais bon...

        ArrayDeque<Integer> integers3 = setUpArrayDeque();
        bench(() -> inversionInPlace(integers3), "Inversion in-place");
        integers3.clear();
        System.gc();

        ArrayDeque<Integer> integers4 = setUpArrayDeque();
        bench(() -> inversionInPlaceOptiTaille(integers4), "Inversion in-place OptimisationTaille");
        integers4.clear();
        System.gc();


        LinkedList<Integer> integers5 = setUpLinkedList();
        bench(() -> inversionLinkedList(integers5), "LinkedList Inversion ");
        integers5.clear();
        System.gc();

        LinkedList<Integer> integers6 = setUpLinkedList();
        bench(() -> inversionInPlaceLinkedList(integers6), "LinkedList Inversion in-place");
        integers6.clear();
        System.gc();

    }

    private static LinkedList<Integer> setUpLinkedList() {
        int numberOfElements = Integer.MAX_VALUE >> 6;
        LinkedList<Integer> integers = new LinkedList<>();
        for (int i = 0; i <  numberOfElements; ++i) {
            integers.push(i);
        }
        return integers;
    }

    private static ArrayDeque<Integer> setUpArrayDeque(){
        int numberOfElements = Integer.MAX_VALUE >> 6;
        ArrayDeque<Integer> integers = new ArrayDeque<>(numberOfElements);
        for (int i = 0; i <  numberOfElements; ++i) {
            integers.push(i);
        }
        return integers;
    }

    private static void bench(ToTest test, String args) {
        long before = System.nanoTime();
        test.execute();
        long after = System.nanoTime();

        System.out.println("Test pour : " + args);
        long durationInS = TimeUnit.NANOSECONDS.toSeconds(after-before);
        long durationInMs = TimeUnit.NANOSECONDS.toMillis(after-before) % 1000;
        long durationInUs = TimeUnit.NANOSECONDS.toMicros(after-before) % 1000;
        long durationInNs = (after-before) % 1000;
        String format = "%03d";

        System.out.println(durationInS + "," + String.format(format,durationInMs) + " " + String.format(format,durationInUs) + " " + String.format(format,durationInNs));
    }

    public static <T> Deque<T> inversion(Deque<T> pile) {
        Deque<T> retour = new ArrayDeque<>();
        while (!pile.isEmpty()) retour.push(pile.pop());
        return retour;
    }

    public static <T> Deque<T> inversionLinkedList(Deque<T> pile) {
        Deque<T> retour = new LinkedList<>();
        while (!pile.isEmpty()) retour.push(pile.pop());
        return retour;
    }

    public static <T> Deque<T> inversionOptimisationTaille(Deque<T> pile) {
        Deque<T> retour = new ArrayDeque<>(pile.size());
        while (!pile.isEmpty()) retour.push(pile.pop());
        return retour;
    }

    public static <T> void inversionInPlace(Deque<T> pile) {
        Deque<T> list = new ArrayDeque<>();
        while(!pile.isEmpty()) list.addFirst(pile.pop()); // Attention ??
        while(!list.isEmpty()) pile.push(list.removeLast()); // Complexite ??
    }


    public static <T> void inversionInPlaceLinkedList(Deque<T> pile) {
        Deque<T> list = new LinkedList<>();
        while(!pile.isEmpty()) list.addFirst(pile.pop()); // Attention ??
        while(!list.isEmpty()) pile.push(list.removeLast()); // Complexite ??
    }


    public static <T> void inversionInPlaceOptiTaille(Deque<T> pile) {
        Deque<T> list = new ArrayDeque<>(pile.size());
        while(!pile.isEmpty()) list.addFirst(pile.pop()); // Attention ?? L M A O -> https://android.googlesource.com/platform/prebuilts/fullsdk/sources/+/refs/heads/androidx-xr-arcore-release/android-34/java/util/ArrayDeque.java
        while(!list.isEmpty()) pile.push(list.removeLast()); // Complexite ??
    }
}
