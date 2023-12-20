package exercice2.exercice2_10;

import exercice2.exercice2_10.qcm.Reponse;

public class Question{
   public String enonce;
    int difficulte=50; // la difficulte varie de 0 à 100
    public Question(String e){this.enonce = e;}
    void setDifficulte(int d){this.difficulte = d;}
    int getDifficulte(){return this.difficulte;}
    String getEnonce(){return this.enonce;}

    public String obtenirLaQuestion(){return this.enonce+"\n";}

    @Override
    public String toString() {
        return "Question{" +
                "enonce='" + enonce + '\'' +
                ", difficulte=" + difficulte +
                '}';
    }
}