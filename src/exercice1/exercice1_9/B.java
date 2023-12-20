package exercice1.exercice1_9;

class B extends A {
    int i = 1;

    B() {
        super(2);
    }

    void setI(int l) {
        this.i = l;
    }

    void setI(A a) {
        super.i = a.i;
    }

    void setI(B b) {
        this.i = b.i;
    }

    public static void main(String[] truc) {
        A a = new A(5);
        B b = new B();
        System.out.println("a.i=" + a.i + ", b.i=" + b.i + " ou " + ((A) b).i);
        b.setI(3);
        b.setI(a);
        System.out.println("a.i=" + a.i + ", b.i=" + b.i + " ou " + ((A) b).i);
    }
}
