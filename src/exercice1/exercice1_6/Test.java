package exercice1.exercice1_6;

class Test{
    int i;
    Test(){
        this.i = 1;
    }
    Test(int i){
        this();
        this.i = i;
    }
    void m(){
        this.i++;
        System.out.println(this.i);
    }

    protected void finalize(){

        System.out.println(this.i);
    }
    public static void main(String[] toto){
        Test i = new Test(2);
        i.m();
        i = new Test();
        System.gc();



    }
}
