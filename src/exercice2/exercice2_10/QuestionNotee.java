package exercice2.exercice2_10;

import exercice2.exercice2_10.qcm.QuestAChoixMultiple;

public class QuestionNotee {
    Question q;
    int points;

    public QuestionNotee(Question q, int points) {
        this.q = q;
        this.points = points;
    }
    int getPoints(){return this.points;}
    int getDifficulte(){return  this.q.getDifficulte();}

    void  setDifficulte(int difficulte){this.q.setDifficulte(difficulte);}
    String getEnonce(){ return this.q.getEnonce();}

    private  String getQuestion() { return this.q.obtenirLaQuestion();}

}
