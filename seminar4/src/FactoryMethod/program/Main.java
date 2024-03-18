package FactoryMethod.program;

import FactoryMethod.clase.PersonalSpital;
import FactoryMethod.fabrici.*;

public class Main {
    public static void main(String[] args) {
        FactoryAngajati factoryAsistent = new FactoryAsistent();
        FactoryAngajati factoryMedic = new FactoryMedic();
        FactoryAngajati factoryBrancardier = new FactoryBrancardier();
        FactoryAngajati factoryInfirmier = new FactoryInfirmier();

        ProcesareAngajat(factoryAsistent,"Andreea",1200);
        ProcesareAngajat(factoryMedic,"Alexandru",2300);
        ProcesareAngajat(factoryBrancardier,"Daniel",1500);
        ProcesareAngajat(factoryInfirmier,"Paula",2000);
    }
    public static void ProcesareAngajat(FactoryAngajati factory,String nume, int salariu){
        PersonalSpital angajat = factory.creareAngajat(nume,salariu);
        angajat.afisare();
    }
}
