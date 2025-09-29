package preparations.lab4;

public  class Rien<T> extends PeutEtre<T> {

    @Override
    public  boolean estQQChose() {
        return false;
    }

    @Override
    public  boolean estRien() {
        return true;
    }

    @Override
    public  T qQchose() throws ARien {
        throw new ARien("N'a rien :(");
    }
}
