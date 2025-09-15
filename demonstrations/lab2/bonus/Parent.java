package demonstrations.lab2.bonus;

sealed public class Parent permits Enfant1, Enfant2 {

    public static void main(String[] args) {
        Parent p = new Enfant1();
        int i = 2;

        switch(i) {
            case 1 :
                break;
                case 2:
                    break;
        }
        if (p instanceof Enfant1) {
            Enfant1 e1 = (Enfant1) p;

        }
    }

}
