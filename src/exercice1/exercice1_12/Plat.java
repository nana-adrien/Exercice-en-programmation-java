package exercice1.exercice1_12;

import java.util.ArrayList;

public class Plat {
    private  String nomDuPlat;
    private ArrayList<Ingredient> listDesIngredients ;


    public Plat(String nomDuPlat) {
        this.nomDuPlat = nomDuPlat;
        this.listDesIngredients = new ArrayList<Ingredient>();
    }

    public  void  ajouterlIngredient(Ingredient ingredient){
        listDesIngredients.add(ingredient);
    }


    public String getNomDuPlat() {
        return nomDuPlat;
    }

    public ArrayList<Ingredient> getListDesIngredients() {
        return listDesIngredients;
    }

    @Override
    public String toString() {
        return "Plats{" +
                "nomDuPlat='" + nomDuPlat + '\'' +
                ", listDesIngredients=" + listDesIngredients +
                '}';
    }

    public boolean equals(Object o){
         if(o instanceof  Plat) {
            for (Ingredient ingredient : this.listDesIngredients) {
                if(((Plat) o).listDesIngredients.contains(ingredient) ) return true;

            }
        }

         return false;
    }




}
