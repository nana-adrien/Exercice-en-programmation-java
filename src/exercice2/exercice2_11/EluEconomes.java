package exercice2.exercice2_11;

public class EluEconomes extends Elu{



    public EluEconomes(String nom, String prenom) {
        super(nom, prenom);
    }
    void depenseDotation(int montant) {
        for (Personne assistant : this.listeDesAssistants) {
            if (montant > 1480) {
                assistant.addSous(1480);
                montant = montant - 1480;
            }
        }
    }
/*
    @Override
    public void verserUneDotationAuxAssistants() {
        int sous=0;
        sous=this.compteBancaire/ listeDesAssistants.size();
        if (sous>1480) {
            this.compteBancaire=sous-1480;
           sous=sous-this.compteBancaire;
        }
        for (Personne assistant : listeDesAssistants){
            assistant.compteBancaire=0;
            assistant.addSous(sous);
    }
    }*/
}
