package exercice2.exercice2_8;

public class TestExo2_8 {
    public static void main(String[] args) {
        A a2 = new A(5);
        B b1 = new B(a2);
        B b2 = new B();
        System.out.println(b1.i);//2
        System.out.println(((A) b1).i);//3
        System.out.println(b1.bidule.i);//5
        System.out.println(b2.i);//2
        System.out.println(((A) b2).i);//0
        System.out.println(b2.bidule.i);//0
    }
}
