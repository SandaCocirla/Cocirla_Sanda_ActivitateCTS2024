package pregatire_test_factory.SimpleFactory.ProblemaSportiv.SimpleFactory;

public class Portar extends Jucator{

    public Portar(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afiseazaJucator() {
        System.out.println("Portarul " + super.getNume() + " are salariul " + super.getSalariu());
    }

}
