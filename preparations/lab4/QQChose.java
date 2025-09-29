package preparations.lab4;

public  class QQChose<T> extends PeutEtre<T> {
    private T quelquechose;

    public QQChose(T quelquechose) {
        this.quelquechose = quelquechose;
    }

    @Override
    public  boolean estQQChose() {
        return true;
    }

    @Override
    public  boolean estRien() {
        return false;
    }

    @Override
    public  T qQchose() throws ARien {
        return quelquechose;
    }
}
