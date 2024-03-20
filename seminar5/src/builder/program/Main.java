package builder.program;

import builder.clase.AbstractBuilder;
import builder.clase.Pacient;
import builder.clase.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        AbstractBuilder builder = new PacientBuilder("Andrei");

        Pacient pacient = builder.adaugaHalatPentruInterior().adaugaMicDejunInclus().build();
        System.out.println(pacient);
    }
}
