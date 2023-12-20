package exercice2.exercice2_6;

public class A {
    A a;
    A(){ this.a = this; }
    A(A a){ this.a = a; }
    void m(){
        if(this == this.a) System.out.println("Ahah!");
        else System.out.println("Héhé!");
    }
}
