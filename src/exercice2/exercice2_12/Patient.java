package exercice2.exercice2_12;

import exercice2.exercice2_12.actesMedical.ActesMedical;
import exercice2.exercice2_12.actesMedical.extend_acte_medical.sion.extend_soin.PriseDeMedicament;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Patient {
    String nom;
    String prenom;
    Date  dateDeNaissance;
    char sexe;
    ArrayList<ActesMedical> actesMedicaux;

    public Patient(String nom, String prenom, Date  dateDeNaissance, char sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.sexe = sexe;
        this.actesMedicaux = new ArrayList<ActesMedical>();
    }


    public  int getAge(){return LocalDate.now().getYear() -this.dateDeNaissance.getYear();}

    public void  ajouterActeMedical(ActesMedical actesMedical){this.actesMedicaux.add(actesMedical);}

    public int nombreDePriseDeMedicamentParjour(){
        int sommeDesPrises=0;
        for(ActesMedical actesMedical:actesMedicaux){
            if (actesMedical instanceof PriseDeMedicament){
                sommeDesPrises=sommeDesPrises+((PriseDeMedicament)actesMedical).nombreDePriseDuMedicamentParJour();
            }
        }
        return sommeDesPrises;
    }




}
