package exercice1.exercice1_11;

public class PoupeeRusse {
    private int taille;
    private boolean estOuvert;
    private PoupeeRusse contientPoupee;
    private PoupeeRusse estDansPoupee;

    public PoupeeRusse(int taille) {
        this.taille = taille;
        this.estOuvert = false;
    }

  /*  public void contenirUnePoupee(PoupeeRusse poupee){
        this.contientPoupee =poupee;
    }*/

    public void placerDans(PoupeeRusse p){
        if(!this.estOuvert && this.estDansPoupee==null){
            if (p.isEstOuvert() && p.getContientPoupee()==null){
                if(this.taille<p.getTaille()){
                    p.setContientPoupee(this);
                    this.estDansPoupee=p;
                }

            }

        }
    }



    public  void ouvrir(){
        if(!this.estOuvert && this.estDansPoupee==null){
            this.estOuvert=true;
        }
    }

    public void fermer(){
        if(estOuvert && estDansPoupee==null){
            estOuvert=false;
        }
    }


    public  void  sortirDe(PoupeeRusse p){
        if (p.getContientPoupee()==this && p.isEstOuvert()){
            p.setContientPoupee(null);
            this.estDansPoupee=null;
        }
    }



    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public boolean isEstOuvert() {
        return estOuvert;
    }

    public PoupeeRusse getEstDansPoupee() {
        return estDansPoupee;
    }

    public void setEstDansPoupee(PoupeeRusse estDansPoupee) {
        this.estDansPoupee = estDansPoupee;
    }

    public void setEstOuvert(boolean estOuvert) {
        this.estOuvert = estOuvert;
    }

    public PoupeeRusse getContientPoupee() {
        return contientPoupee;
    }

    public void setContientPoupee(PoupeeRusse contientPoupee) {
        this.contientPoupee = contientPoupee;
    }
}
