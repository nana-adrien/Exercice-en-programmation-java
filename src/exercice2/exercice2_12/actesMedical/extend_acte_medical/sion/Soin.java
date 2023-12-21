package exercice2.exercice2_12.actesMedical.extend_acte_medical.sion;

import exercice2.exercice2_12.actesMedical.ActesMedical;

import java.time.Instant;

public class Soin extends ActesMedical {
    int ameliorationDeLEtatDuPatient;// taux d'amélioration entre 0 et 100%

    public Soin(String soignant, Instant date, int ameliorationDeLEtatDuPatient) {
        super(soignant, date);
        this.ameliorationDeLEtatDuPatient = ameliorationDeLEtatDuPatient;
    }



}
