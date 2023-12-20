package exercice1.exercice1_12;

public class ingrediantADecouper extends Ingredient {


    public ingrediantADecouper(String nom_aliment, String etat, int quantite, String unite) {
        super(nom_aliment, etat, quantite, unite);
    }

    public void decouper(){
        if(!etat.equals("decouper")){
            etat="decouper";
        }
    }


}
