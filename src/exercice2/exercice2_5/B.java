package exercice2.exercice2_5;

class B{
    int i = 5;
    B(){ this.i = this.i-1; }
    B(int i){ this(); this.i = i; }
}