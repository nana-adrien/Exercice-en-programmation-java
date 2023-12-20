package exercice1.exercice1_5;

class C2{
    C1 c;
    int i;
    C2(int i, C1 c){
        if(c == null) this.c = new C1(i+1,this);
        else this.c = c;
        this.i = i;
    }
}
