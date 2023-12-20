package exercice1.exercice1_12;

public class TestRecetteDeCuisine {
    public static void main(String[] args) {
        Plat plat1 =new Plat("choucroute");

        plat1.ajouterlIngredient(new Ingredient("choucroute","cuite",500,"g"));
        plat1.ajouterlIngredient(new Ingredient("lard","cuit",150,"g"));
        plat1.ajouterlIngredient(new Ingredient("saucisses","entieres et cuites ",2,""));

        for (Ingredient ingredient : plat1.getListDesIngredients()){
            System.out.println(ingredient.toString());
        }

        Plat plat2 =new Plat("choucroute");
        plat2.ajouterlIngredient(new Ingredient("choucroute","cuite",500,"g"));
        plat2.ajouterlIngredient(new Ingredient("lard","cuit",150,"g"));

        plat1.equals(plat2);


    }
}
