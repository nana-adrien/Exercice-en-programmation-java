package exercice2.exercice2_3;

public class Titi extends Toto{
    int k;

    public Titi(int i) {
        super(i);
        this.i=i+super.i;
        this.k = this.j+2;
    }


    /**
     *
     * @param args
     * Si on remplace les … par chacune des quatre instructions ci-dessous, indiquer si le programme
     * compile et si oui, à quel affichage il conduit.
     * a. Toto t = new Titi(1);
     * b. Titi t = new Titi(1);
     * c. Titi t = (Toto) new Titi(1);
     * d. Titi t = new Titi(1);
     */
    public static void main(String[] args) {

        Titi t=new Titi(1);

        System.out.println(t.i);// 2
        System.out.println(t.j);//1
        System.out.println(t.k);//3
    }


}
