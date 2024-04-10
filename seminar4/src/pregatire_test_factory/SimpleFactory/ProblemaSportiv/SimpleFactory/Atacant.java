package pregatire_test_factory.SimpleFactory.ProblemaSportiv.SimpleFactory;

public class Atacant extends Jucator{
    public Atacant(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afiseazaJucator() {
        System.out.println("Atacant " + super.getNume() + " are salariul " + super.getSalariu());
    }
}
