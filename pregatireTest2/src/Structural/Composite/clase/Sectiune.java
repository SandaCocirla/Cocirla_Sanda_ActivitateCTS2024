package Structural.Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements StructuraArborescenta{
    private List<StructuraArborescenta> locuri;
    private String denumire;

    public Sectiune(String denumire) {
        this.locuri = new ArrayList<>();
        this.denumire = denumire;
    }
    @Override
    public void afiseazaNumarLoc(String identare) {
        System.out.println(identare + "Categoria " + this.denumire + " are urmatoarele subcategorii: " );
        for(StructuraArborescenta element : locuri){
            element.afiseazaNumarLoc(identare + "   ");
        }
    }
    @Override
    public void adaugaSectiune(StructuraArborescenta sa) {
        this.locuri.add(sa);
    }

    @Override
    public void stergeSectiune(StructuraArborescenta sa) {
        this.locuri.remove(sa);
    }
    @Override
    public double calculeazaVenit() {
        double suma = 0.0;
        for(StructuraArborescenta element : locuri){
            suma+= element.calculeazaVenit();
        }
        return suma;
    }
}
