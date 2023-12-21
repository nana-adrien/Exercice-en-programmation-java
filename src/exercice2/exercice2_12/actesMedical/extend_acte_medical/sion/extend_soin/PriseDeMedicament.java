package exercice2.exercice2_12.actesMedical.extend_acte_medical.sion.extend_soin;

import exercice2.exercice2_12.actesMedical.extend_acte_medical.sion.Soin;

import java.time.Instant;

public class PriseDeMedicament extends Soin {

    int posologeie;
    int frequence;

    public PriseDeMedicament(String soignant, Instant date, int ameliorationDeLEtatDuPatient, int posologeie, int frequence) {
        super(soignant, date, ameliorationDeLEtatDuPatient);
        this.posologeie = posologeie;
        this.frequence = frequence;
    }

    public int nombreDePriseDuMedicamentParJour(){
        return posologeie*frequence;
    }
}
