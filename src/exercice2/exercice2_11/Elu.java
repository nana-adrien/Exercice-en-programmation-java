package exercice2.exercice2_11;

import java.util.ArrayList;

public class Elu extends  Personne{

    ArrayList<Personne> listeDesAssistants;

    public Elu(String nom, String prenom) {
        super(nom, prenom);
        listeDesAssistants = new ArrayList<Personne>();
    }


    public void  embaucherUnAssistant(String nom , String prenom){
            listeDesAssistants.add(new Personne(nom,prenom));
    }
    public boolean  licencierUnAssistant(String nom , String prenom){
        for (Personne personne: listeDesAssistants){
            if (personne.nom.equals(nom) && personne.prenom.equals(prenom)){
              return listeDesAssistants.remove(personne);
            }
        }
       return false;
    }

    public void verserUneDotationAuxAssistants(){
        for (Personne assistant : this.listeDesAssistants){
            //assistant.compteBancaire=0;
            assistant.addSous(this.compteBancaire/ this.listeDesAssistants.size());
        }
        this.compteBancaire=0;
    }
}



