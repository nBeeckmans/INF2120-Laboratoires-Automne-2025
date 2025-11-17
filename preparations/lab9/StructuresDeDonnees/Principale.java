package preparations.lab9.StructuresDeDonnees;

public class Principale {
    public static void main(String[] args)  {
        FileInt fileInt = new FileInt(15);
        for (int i = 0; i < 20; ++i) {
            fileInt.enfiler(i);
        }

        System.out.println(fileInt);

        while(!fileInt.estVide()) {
            System.out.println(fileInt.defiler());
        }
    }
}
