package exercice2.exercice2_10;

import exercice2.exercice2_10.qcm.QuestAChoixMultiple;

import java.util.ArrayList;

public class Sujet {
    ArrayList<Question> listeDeQuestion;

    public Sujet() {
        this.listeDeQuestion = new ArrayList<Question>();
    }

    public  void ajouterUneQuestion(Question question){
        listeDeQuestion.add(question);
    }

    public void afficherLeSujet(){
        int i=1;

        for (Question question: listeDeQuestion){
            System.out.println(" Question " + i +")- " +question.enonce);
            if(question instanceof QuestAChoixMultiple){

            }
            i++;
        }
    }

    public  int difiCulterMoyenneDuSujet(){

        int sommeDesDifficulterDesQuestions=0;

        for (Question question : listeDeQuestion){
            sommeDesDifficulterDesQuestions=sommeDesDifficulterDesQuestions+question.difficulte;
        }
        return sommeDesDifficulterDesQuestions/listeDeQuestion.size();
    }

}
