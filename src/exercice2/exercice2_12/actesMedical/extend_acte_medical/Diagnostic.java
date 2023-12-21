package exercice2.exercice2_12.actesMedical.extend_acte_medical;

import exercice2.exercice2_12.Maladie;
import exercice2.exercice2_12.actesMedical.ActesMedical;

import java.time.Instant;

public class Diagnostic extends ActesMedical {

    Maladie maladie;
    int validite; // entre 0 et 100%

    public Diagnostic(String soignant, Instant date, Maladie maladie, int validite) {
        super(soignant, date);
        this.maladie = maladie;
        this.validite = validite;
    }
}
