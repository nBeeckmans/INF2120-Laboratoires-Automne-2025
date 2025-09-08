package demonstrations.lab1.couleurs;

public class Couleur {
    private int rouge, vert, bleu;

    public Couleur(int rouge, int vert, int bleu) {
        this.rouge = rouge;
        this.vert = vert;
        this.bleu = bleu;
    }

    public int getRouge() {
        return this.rouge;
    }

    public void setRouge(int rouge) throws Exception {
        if (rouge < 0 || rouge > 255) {
            throw new Exception();
        }
        this.rouge = rouge;
    }

    public boolean setVert(int vert) {
        boolean estValide = false;
        // TODO: a changer
        if (!(vert < 0 || vert > 255)) {
            this.vert = vert;
            estValide =true;
        }

        return estValide;
    }

    public void setBleu(int bleu) {
        // TODO : a ne pas faire !
        bleu = bleu >= 255 ? 255 : bleu;
        bleu = bleu < 0 ? 0 : bleu;
        this.bleu = bleu;
    }

    public String toString() {
        return String.format("%d, %d, %d", rouge, vert, bleu);

    }


    public void blanchir() {
        this.rouge = (255 + this.rouge) / 2;
        this.vert = (255 + this.vert) / 2;
        this.bleu = (255 + this.bleu) / 2;
    }

}
