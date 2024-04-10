package pregatire_test_factory.SimpleFactory.ProblemaSportiv.SimpleFactory;

public class Main {
    public static void main(String[] args) {
       FactoryJucator factoryJucator = new FactoryJucator();
       Jucator atacant = factoryJucator.creareJucator(TipJucator.ATACANT,"Sandu", 4000);
       Jucator portar = factoryJucator.creareJucator(TipJucator.PORTAR,"Gigi",6000);
       Jucator fundas = factoryJucator.creareJucator(TipJucator.FUNDAS,"Alex",4000);

       atacant.afiseazaJucator();
       portar.afiseazaJucator();
       fundas.afiseazaJucator();
    }
}
