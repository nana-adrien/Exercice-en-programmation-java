package exercice2.exercice2_8;

public class B extends A{
    A bidule;
    int i=2;
    B(){
        this.bidule=this;}
    B(A a){
        super(3);
        this.bidule=a;
    }
}
