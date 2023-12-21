package exercice2.exercice2_11;

import java.util.Objects;

public class Personne{
     String nom, prenom;
    int compteBancaire; // montant de son compte en euros
    Personne(String nom, String prenom){
        this.nom = nom; this.prenom = prenom;
        this.compteBancaire = 0;
    }
    void addSous(int montant){
        this.compteBancaire = this.compteBancaire+montant;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", compteBancaire=" + compteBancaire +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return compteBancaire == personne.compteBancaire && Objects.equals(nom, personne.nom) && Objects.equals(prenom, personne.prenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, compteBancaire);
    }
}
