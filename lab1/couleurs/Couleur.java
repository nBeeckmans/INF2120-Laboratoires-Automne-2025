public class Couleur {
    //Pourquoi mettre *private* ici ? Surtout si on met des getters/setters ?
    private int rouge, vert, bleu;

    Couleur(int rouge, int vert, int bleu) {
        this.setRouge(rouge);
        this.setVert(vert);
        this.setBleu(bleu);
    }

    public int getBleu() {
        return bleu;
    }

    public int getRouge() {
        return rouge;
    }

    public int getVert() {
        return vert;
    }

    public void setBleu(int bleu) {
        this.bleu = validerCouleur(bleu);
    }

    public void setRouge(int rouge) {
        this.rouge = validerCouleur(rouge);
    }

    public void setVert(int vert) {
        this.vert = validerCouleur(vert);
    }

    private static int validerCouleur(int couleur) {
        if (couleur > 255)
            couleur = 255;

        if (couleur < 0)
            couleur = 0;

        return couleur;
    }

    public void blanchir() {
      this.rouge = (this.rouge + 255) / 2;
      this.vert = (this.vert + 255) / 2;
      this.bleu = (this.bleu + 255) / 2;
    }

    @Override
    public String toString() {
        // sinon : this.rouge + ", " + this..... + this.bleu;
        return String.format("%d, %d, %d", this.rouge, this.vert, this.bleu);
    }
}
