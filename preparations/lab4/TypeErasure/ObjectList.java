package preparations.lab4.TypeErasure;

public class ObjectList {
    private Object[] objects = new Object[10];

    public void add(Object o) {
        int i = 0;
        Object oDansListe;
        do {
            oDansListe = this.objects[i];
            ++i;
        } while(oDansListe != null);
        // obviously il faut regarde si i est toujours dans la borne superieur de Object;
        objects[i] = o;
    }

    public Object get(int i) {
        // obviously il faut regarde si i est toujours dans la borne superieur de Object;
        return objects[i];
    }
}
