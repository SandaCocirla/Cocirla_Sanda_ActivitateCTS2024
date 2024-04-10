package pregatire_test_factory.SimpleFactory.ProblemaSportiv.FactoryMethod;

public abstract class Jucator {
    private String nume;
    private int salariu;

    public abstract void afisareJucator();

    public Jucator(String nume, int salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    public String nume() {
        return nume;
    }

    public Jucator setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public int salariu() {
        return salariu;
    }

    public Jucator setSalariu(int salariu) {
        this.salariu = salariu;
        return this;
    }
}
