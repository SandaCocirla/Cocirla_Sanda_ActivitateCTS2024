package main;

import clase.AchizitieMedicamente;

public class Main {
    public static void main(String[] args) {
        AchizitieMedicamente reteta = new AchizitieMedicamente("Vitamina C");
        reteta.cumparaMedicament();
        AchizitieMedicamente medicament2 = new AchizitieMedicamente("Paracetamol");
        medicament2.cumparaMedicament();
    }
}
