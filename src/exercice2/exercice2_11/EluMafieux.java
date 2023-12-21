package exercice2.exercice2_11;

public class EluMafieux extends Elu{
    public EluMafieux(String nom, String prenom) {
        super(nom, prenom);
    }

    @Override
    public void  embaucherUnAssistant(String nom , String prenom){
        if (this.nom.equals(nom)) super.embaucherUnAssistant(nom,prenom);
    }
}
