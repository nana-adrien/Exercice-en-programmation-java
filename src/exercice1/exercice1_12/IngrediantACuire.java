package exercice1.exercice1_12;

public class IngrediantACuire extends Ingredient{



    private int temperatureDeCuisson;


    public IngrediantACuire(String nom_aliment, String etat, int quantite, String unite, int temperatureDeCuisson) {
        super(nom_aliment, etat, quantite, unite);
        this.temperatureDeCuisson = temperatureDeCuisson;
    }

    public void cuire(){

        if(!etat.equals("cuit")){
                etat="cuit";
        }

    }


}
