package exercice2.exercice2_4;

import java.util.Map;

public class TestExo2_4 {


    /**
     *
     * @param args
     * Pour chaque programme ci-dessous, indiquez s'il compile et si oui, à quel affichage il conduit.
     * a. b. c.
     * A a = new A(); A a = new A(); A x = new B();
     * B b = new B(); a.addB(new B()); A y = new A();
     * a.addB(b); System.out.println(a.b.m()); B z = new B();
     * System.out.println(a.m()); System.out.println(((A) a.b).m()); x.addB(z);
     * System.out.println(b.m()); System.out.println(x.m());
     * System.out.println(y.m());
     */
    public static void main(String[] args) {

        A a=new A();
        B b=new B();



        a.addB(b);
        System.out.println(b.m());//2
        System.out.println(a.m()); // 1



    }

}
