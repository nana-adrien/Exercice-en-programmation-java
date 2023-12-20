package exercice2.exercice2_9;

public class TestExo2_9 {
    public static void main(String[] toto){
        A a = new A();
        B b = new B();
        System.out.println(b.i);//2
        System.out.println(a.i);//0
        System.out.println(((A) b).i);//0
        b.m(); //B
        a.m(); //A
    }

}
