package exercice2.exercice2_6;

class B extends A{
        B o;
        B(){ super(); this.a = this; this.o = (B) this; }
        void m(){ System.out.println("Ohoh!"); }
public static void main(String[] toto){
        A u = new A();
        A i = new A(u);
        A b = new B();
        u.m();//Ahah!
        i.m();// Hehe!
        b.m();//Ohoh!
        ((B) b).o.m();//Ohoh!
        }
        }
