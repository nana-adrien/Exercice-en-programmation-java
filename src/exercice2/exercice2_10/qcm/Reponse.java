package exercice2.exercice2_10.qcm;

public class Reponse {
    String enonce;
    Boolean valeurDeVeriter;

    public Reponse(String enonce, Boolean valeurDeVeriter) {
        this.enonce = enonce;
        this.valeurDeVeriter = valeurDeVeriter;
    }

    @Override
    public String toString() {
        return "Reponse{" +
                "enonce='" + enonce + '\'' +
                ", valeurDeVeriter=" + valeurDeVeriter +
                '}';
    }
}
