package exercice2.exercice2_11;

public class TestExo2_11 {
    public static void main(String[] args) {
        Elu elu1=new EluEscrocs("paul","binjamin");

        elu1.addSous(100000000);
        elu1.embaucherUnAssistant("nana","adrien");
        elu1.embaucherUnAssistant("ben","pile");
        elu1.embaucherUnAssistant("carine","espoire");
        elu1.embaucherUnAssistant("kimi","jane");

        elu1.verserUneDotationAuxAssistants();

        System.out.println("\n*********** reste  **********\n");

        for(Personne personne: elu1.listeDesAssistants){
            System.out.println(personne);
        }
        System.out.println( " reste des donnations compteBancaire= "+ elu1.compteBancaire);
        System.out.println( " reste des donnations CompteBanquaireEnSuisse = "+ ((EluEscrocs)elu1).compteBanquaireEnSuisse);


        System.out.println("\n*********** licencier **********\n");


        System.out.println(  elu1.licencierUnAssistant("kimi","jane"));
        elu1.licencierUnAssistant("carine","espoire");

        elu1.verserUneDotationAuxAssistants();



        for(Personne personne: elu1.listeDesAssistants){
            System.out.println(personne);
        }

        System.out.println("\n*********** reste  **********\n");

        System.out.println( " reste des donnations apres licenciment compteBancaire = "+ elu1.compteBancaire);
        System.out.println( " reste des donnations apres licenciment CompteBanquaireEnSuisse = "+ ((EluEscrocs)elu1).getCompteBanquaireEnSuisse());



    }
}
