package exercice2.exercice2_7;

class B extends A {
    String f(B obj) { return ("B et B"); }
    String f(A obj) { return ("B et A"); }
}
