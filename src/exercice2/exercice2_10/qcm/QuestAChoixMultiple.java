package exercice2.exercice2_10.qcm;



import exercice2.exercice2_10.Question;

import java.util.ArrayList;

public class QuestAChoixMultiple extends Question {

    ArrayList<Reponse> listReponses;

    public QuestAChoixMultiple(String e) {
        super(e);

        this.listReponses = new ArrayList<Reponse>();
    }

    public  void ajouterUneReponsePossible(String text,boolean verasiter){
        this.listReponses.add(new Reponse(text,verasiter));
    }

    public String obtenirLaQuestion(){
        String resultat=this.enonce+":";
        for (Reponse reponse:listReponses) resultat=resultat+ "\n -> "+reponse.enonce;
        return resultat+"\n";
    }

  /*public   void afficherReponsePosible(){
        int i=1;
        for (Reponse reponse:listReponses){
            System.out.println( "  ->  "+i+"-"+ reponse.enonce);
            i++;
        }
    }*/


}
