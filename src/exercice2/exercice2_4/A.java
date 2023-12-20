package exercice2.exercice2_4;

public class A {
    B b;

    void addB(B b){
        this.b=b;
    }

    int m(){
        if(this.b !=null)return -1 + this.b.m();else  return 0;
    }
}
