package exercice1.exercice1_11;

public class TestMain {
    public static void main(String[] args) {
        PoupeeRusse poupeeRusse1=new PoupeeRusse(15);
        PoupeeRusse poupeeRusse2=new PoupeeRusse(35);
        PoupeeRusse poupeeRusse3=new PoupeeRusse(14);

/*



       System.out.println(poupeeRusse1.toString());

       System.out.println("--------------1----------------");

       System.out.println(poupeeRusse2.toString());

        System.out.println(poupeeRusse1.toString());




        System.out.println("-----------2-poupeeRusse1.placerDans(poupeeRusse2)------------------");

        poupeeRusse1.placerDans(poupeeRusse2);


        System.out.println(poupeeRusse1.toString());

        System.out.println(poupeeRusse2.toString());


        System.out.println("-----------2-poupeeRusse1.sortirDe(poupeeRusse2)------------------");

        poupeeRusse1.sortirDe(poupeeRusse2);

        System.out.println(poupeeRusse1.toString());

        System.out.println(poupeeRusse2.toString());




        System.out.println("-----------3-poupeeRusse1.placerDans(poupeeRusse3)------------------");

        poupeeRusse1.placerDans(poupeeRusse3);
        System.out.println(poupeeRusse1.toString());

        System.out.println(poupeeRusse3.toString());



*/

        System.out.println("----------teste -4-poupeeRusse1.ouvrir() ---poupeeRusse2.ouvrir()--------poupeeRusse3.setTaille(25);-------");




        poupeeRusse3.ouvrir();
        System.out.println(poupeeRusse1.toString());
        System.out.println(poupeeRusse2.toString());
        System.out.println(poupeeRusse3.toString());

        System.out.println("----------teste -4-poupeeRusse1.ferme() ---poupeeRusse2.fermer()--------poupeeRusse3.setTaille(25);-------");


        poupeeRusse3.setTaille(25);
        poupeeRusse1.placerDans(poupeeRusse3);


        poupeeRusse3.fermer();
        System.out.println(poupeeRusse1.toString());
        System.out.println(poupeeRusse2.toString());
        System.out.println(poupeeRusse3.toString());

    }
}
