package SimpleFactory.program;

import SimpleFactory.clase.FactoryPersonal;
import SimpleFactory.clase.PersonalSpital;
import SimpleFactory.clase.TipAngajat;

public class Main {
    public static void main(String[] args) {
        FactoryPersonal factoryPersonal = new FactoryPersonal();
        PersonalSpital medic = factoryPersonal.creareAngajat(TipAngajat.MEDIC, "Marcel",1500,3);
        PersonalSpital asistent = factoryPersonal.creareAngajat(TipAngajat.ASISTENT, "Ioana", 1000,0);
        PersonalSpital brancardier = factoryPersonal.creareAngajat(TipAngajat.BRANCARDIER,"Anton", 1300,0);
        PersonalSpital infirmier = factoryPersonal.creareAngajat(TipAngajat.INFIRMIER,"Maria",1600,0);

        medic.afisare();
        asistent.afisare();
        brancardier.afisare();
        infirmier.afisare();

    }
}
