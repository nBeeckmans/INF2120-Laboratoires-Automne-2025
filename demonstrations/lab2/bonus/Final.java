package demonstrations.lab2.bonus;

final public class Final {
    final int a;
    final double b;

    public Final(int a, double b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[]args) {
        final int a = 2;
        // a = 3; pas bien!
        //
        final Autre a2 = new Autre();
        a2.a = 3;
        //a2 = new Autre();
    }

    public static void methode(final Autre a) {
        a = new Autre();

    }

    final public void methode2() {

    }

}
