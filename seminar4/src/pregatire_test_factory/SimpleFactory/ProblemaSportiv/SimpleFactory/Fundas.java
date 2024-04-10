package pregatire_test_factory.SimpleFactory.ProblemaSportiv.SimpleFactory;

public class Fundas extends Jucator{
    public Fundas(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afiseazaJucator() {
        System.out.println("Fundasul " + super.getNume() + " are salariul " + super.getSalariu());

    }
}
