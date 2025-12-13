public class Lambdas {
    public interface Fonctionnelle<T> {
        T methode(T argument);
    }

    public interface NonFonctionnelle<T> {
        T methode();
        T methode2();
    }

    public interface TjrsFonctionnelle {
        boolean test();
        default boolean inverse() {
            return !test();
        }
    }

    public static void main() {
        Fonctionnelle<String> salutation = (String x) -> {
            return "Allo !" + x;
        };

        Fonctionnelle<String> salutation2 =  x -> {
            return "Allo !" + x;
        };

        Fonctionnelle<String> salutation3 =  x -> "Allo !" + x;
        Fonctionnelle<String> salutation4 =  (x) -> "Allo !" + x;
        // Fonctionnelle<String> salutation5 =  String x -> "Allo !" + x; NON !

        Fonctionnelle<String> classeAnonyme = new Fonctionnelle<String>() {
            @Override
            public String methode(String argument) {
                return "WOW!";
            }
        };

        // Bonus !
        TjrsFonctionnelle vrai = () -> true;
        boolean faux = vrai.inverse();
    }
}
