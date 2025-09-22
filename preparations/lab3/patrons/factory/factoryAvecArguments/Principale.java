package preparations.lab3.patrons.factory.factoryAvecArguments;


public class Principale {

    public static void main(String[] args) {
        final var argument = new ArgumentsCercle();
        argument.rayon = 10;

        final var factory = new CercleFactory(argument);
        final var cercle = factory.build();

        System.out.println(cercle.aire());
    }
}
