package preparations.lab4.TypeErasure;

public class GenericList<T> {

    @SuppressWarnings("unchecked")
    private T[] objects = (T[]) new Object[10];

    public void add(T o) {
        int i = 0;
        T oDansListe;
        do {
            oDansListe = this.objects[i];
            ++i;
        } while(oDansListe != null);
        // obviously il faut regarde si i est toujours dans la borne superieur de Object;
        objects[i] = o;
    }

    public T get(int i) {
        // obviously il faut regarde si i est toujours dans la borne superieur de Object;
        return objects[i];
    }
}
