package builderInn.program;

import builderInn.clase.AbstractBuilder;
import builderInn.clase.Pacient;

public class Main {
    public static void main(String[] args) {
        AbstractBuilder builder = new Pacient.PacientBuilder("Abdrei");
        Pacient pacient = builder.adaugaMicDejunInclus(true).adaugaHalatPentruInterior(true).build();
        Pacient pacient2 = builder.adaugaMicDejunInclus(false).build();
        System.out.println(pacient);
        System.out.println(pacient2);

    }
}
