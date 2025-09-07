public class Main {
    public static void main(String[] arguments) {
        Couleur couleur1 = new Couleur(1,200,6);
        Couleur couleur2 = couleur1;
        System.out.println(couleur2);
        couleur2.setRouge(22);
        System.out.println(couleur1);
        couleur1.blanchir();
        System.out.println(couleur1);
    }
}
