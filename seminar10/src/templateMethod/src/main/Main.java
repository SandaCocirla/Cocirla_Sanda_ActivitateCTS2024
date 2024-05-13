package templateMethod.src.main;

import templateMethod.src.clase.AchizitieMedicamente;

public class Main {
    public static void main(String[] args) {
        AchizitieMedicamente reteta = new AchizitieMedicamente("Vitamina C");
        reteta.cumparaMedicament();
        AchizitieMedicamente medicament2 = new AchizitieMedicamente("Paracetamol");
        medicament2.cumparaMedicament();
    }
}
