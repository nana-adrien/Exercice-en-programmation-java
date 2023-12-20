package exercice2.exercice2_2;

public class Tutu extends Titi{

    int z;

    public Tutu(int k, int l, int m) {
        super(k, l);
        this.z = m;
    }

    public int ajoute(int a){
        return x+3*a;
    }

    public  void  moi(){
        super.moi();
        System.out.println("z= "+z);
    }

}
