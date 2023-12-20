package exercice2.exercice2_10;

import java.util.ArrayList;

class SujetExamen{
    ArrayList<QuestionNotee> questions;
    SujetExamen(){
        this.questions = new ArrayList<QuestionNotee>();
    }
    void addQuestion(QuestionNotee q){
        this.questions.add(q);
    }
    void removeQuestion(QuestionNotee q){
        this.questions.remove(q);
    }
    int difficulteMoyenne(){
        int n = 0;
        for(QuestionNotee q:this.questions){
            n = n + q.getDifficulte();
        }
        return n/this.questions.size();
    }
}
