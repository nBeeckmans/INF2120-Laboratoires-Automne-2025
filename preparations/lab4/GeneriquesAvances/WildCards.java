package preparations.lab4.GeneriquesAvances;

import java.util.ArrayList;

public class WildCards {

    static class BeauFrere {

    }

    static class GrandParent {
        public void methodeGrandParent() {

        }

    }

    static class Parent extends GrandParent {
        public void methodeParent() {

        }
    }

    static class Enfant extends Parent {
        public void methodeEnfant() {

        }

    }

    static class Bebe extends Enfant {
        public void methodeBebe() {

        }
    }

    public static <T extends Parent> void methode(T objet) {
        System.out.println(objet.getClass().getName());
    }

    public static void methode2(ArrayList<?> objet) {
        System.out.println(objet.getClass().getName());
    }


    public static void methode3(ArrayList<? extends Parent> objet) {
        System.out.println(objet.getClass().getName());
        objet.get(0).methodeParent();
    }

    public static void methode4(ArrayList<? super Enfant> objet) {
        System.out.println(objet.getClass().getName());

    }

    public static void main(String []args){
        methode(new Parent());
        methode(new Enfant());
        //methode2(new ArrayList<Enfant>());
        //methode3(new ArrayList<Parent>());
        //methode3(new ArrayList<Enfant>());
        //methode3(new ArrayList<GrandParent>()); marche pas
        //methode4(new ArrayList<Enfant>());
        //methode4(new ArrayList<Parent>());
        //methode4(new ArrayList<GrandParent>());
        // methode4(new ArrayList<BeauFrere>()); car beau frere n'est pas parent de Enfant
        // methode4(new ArrayList<Bebe>()); same ici
        //
        ArrayList<? extends Integer> intList = new ArrayList<>(); // Accepte tout enfant de Integer
        ArrayList<? extends Number>  numList = intList;  // OK (number est parent de Integer)
        // Number > Integer > enfant de Integer
    }
}
