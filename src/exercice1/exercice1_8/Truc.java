package exercice1.exercice1_8;

class Truc{
    String s;
    Truc(){
        this.s = "Bonjour";
    }
    Truc(String s){
        this.s = s;
    }
    public String toString(){
        return this.s;
    }
    public boolean equals(Object o){
        return o instanceof Truc && this.s.equals(((Truc) o).s);
    }
}
class Bidule{
    String s;
    Truc t;
    Bidule(Truc t){
        this.t = t;
        if(t!=null) this.s = t.s;
        else this.s = "Bonjour";
    }
    public String toString(){
        if(this.t == null) return this.s;
        else return this.t.s;
    }
    public static void main(String[] toto){
        Truc t1 = new Truc(), t2 = new Truc("Hello");
        Bidule b1 = new Bidule(t1), b2 = new Bidule(null);
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(t1.equals(t2));
        System.out.println(t1.equals(b1));
    }
}
