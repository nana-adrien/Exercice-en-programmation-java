package exercice1.exercice1_4;

class Test {
    int i;
    Test(Test t) {
        if(t == null) {
            this.i = 12;
            System.out.println(this.i);
        }
        else{
            t.m();
            this.i = t.i;
        }
    }
    void m() {
        this.i++;
        System.out.println(this.i);
    }
    public static void main(String[] toto) {
        Test i = new Test(new Test(new Test(null)));
    }
}