package Structural.Composite.main;

import Structural.Composite.clase.Loc;
import Structural.Composite.clase.Sectiune;
import Structural.Composite.clase.StructuraArborescenta;

public class Main {
    public static void main(String[] args) {
        StructuraArborescenta locuri = new Sectiune("Tribuna");
        StructuraArborescenta tribunaNord = new Sectiune("Ttribuna Nord");
        StructuraArborescenta tribunaSud = new Sectiune("Tribuna Sud");
        StructuraArborescenta tribunaCopii = new Sectiune("Tribuna Copii");

        StructuraArborescenta loc1 = new Loc(1,50);
        StructuraArborescenta loc2 = new Loc(2,50);
        StructuraArborescenta loc20 = new Loc(20,150);

        locuri.adaugaSectiune(tribunaNord);
        locuri.adaugaSectiune(tribunaSud);
        locuri.adaugaSectiune(tribunaCopii);

        tribunaNord.adaugaSectiune(loc1);
        tribunaNord.adaugaSectiune(loc2);
        tribunaCopii.adaugaSectiune(loc20);


        locuri.afiseazaNumarLoc("  ");

        double suma = tribunaNord.calculeazaVenit();
        System.out.println("\nSuma pentru Tribunalul de Nord este " + suma);
    }

}
