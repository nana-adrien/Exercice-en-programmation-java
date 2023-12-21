package exercice2.exercice2_11;

public class EluEscrocs extends EluEconomes{
    int compteBanquaireEnSuisse;
    public EluEscrocs(String nom, String prenom) {
        super(nom, prenom);
    }

    public int getCompteBanquaireEnSuisse() {
        return compteBanquaireEnSuisse;
    }

    @Override
    void depenseDotation(int montant) {
        super.depenseDotation(montant);
        if(montant>0) this.compteBanquaireEnSuisse=this.compteBanquaireEnSuisse+montant;
    }

    /*@Override
    public void verserUneDotationAuxAssistants() {
        super.verserUneDotationAuxAssistants();
        this.compteBanquaireEnSuisse= this.compteBancaire;
        this.compteBancaire=0;

    }*/



}
