package exercice2.exercice2_10;

import exercice2.exercice2_10.qcm.QuestAChoixMultiple;
import exercice2.exercice2_10.qcm.Reponse;

public class TestExo2_10 {
    public static void main(String[] args) {
        /*Sujet sujet1=new Sujet();

        Question question1=new Question("quel est votre nom?");
        QuestAChoixMultiple question2=new QuestAChoixMultiple("les trois couleurs du ddrapeau camerounais sont : ");
        question2.ajouterUneReponsePossible("vert-rouge-jaune",true);
        question2.ajouterUneReponsePossible("vert-jaune-rouge",false);
        question2.ajouterUneReponsePossible("jaune-rouge-vert",false);


        sujet1.ajouterUneQuestion(question1 );
        sujet1.ajouterUneQuestion(question2 );

        sujet1.afficherLeSujet();

        System.out.println(" la difficulter du sujet est : "+ sujet1.difiCulterMoyenneDuSujet());
*/


        SujetExamen sujetExamen=new SujetExamen();

        sujetExamen.addQuestion(new QuestionNotee(new Question("quel est votre nom? "),5));

        QuestAChoixMultiple question=new QuestAChoixMultiple("les trois couleurs du drapeau camerounais sont");
        question.ajouterUneReponsePossible("vert-rouge-jaune",true);
        question.ajouterUneReponsePossible("vert-jaune-rouge",false);
        question.ajouterUneReponsePossible("jaune-rouge-vert",false);


        sujetExamen.addQuestion(new QuestionNotee(question,15));

        sujetExamen.addQuestion(new QuestionNotee(new Question("comment se nomme le president de la republique?  "),15));


        for (QuestionNotee questionNotee: sujetExamen.questions){
            System.out.printf(questionNotee.q.obtenirLaQuestion());
        }

        System.out.println(" la difficulter du sujet est : "+ sujetExamen.difficulteMoyenne());



    }
}
