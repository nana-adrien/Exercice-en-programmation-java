package exercice1.exercice1_9;

class A{
    int i = 0;
    A(int j){
        this.i = j;
    }
    void setI(int k){
        this.i=k;
    }
    void setI(A a){
        this.i = a.i;
    }
}
