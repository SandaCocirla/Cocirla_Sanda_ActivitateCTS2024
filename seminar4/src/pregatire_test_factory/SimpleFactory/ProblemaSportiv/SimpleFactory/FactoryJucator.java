package pregatire_test_factory.SimpleFactory.ProblemaSportiv.SimpleFactory;

public class FactoryJucator {
    public Jucator creareJucator(TipJucator tipJucator, String nume, int salariu) {
        switch(tipJucator){
            case ATACANT:
                return new Atacant(nume, salariu);
            case FUNDAS:
                return new Fundas(nume, salariu);
            case PORTAR:
                return new Portar(nume, salariu);
            default:
              return null;
        }
    }
}
