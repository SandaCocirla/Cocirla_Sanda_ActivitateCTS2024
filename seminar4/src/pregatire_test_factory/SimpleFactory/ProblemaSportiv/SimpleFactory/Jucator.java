package pregatire_test_factory.SimpleFactory.ProblemaSportiv.SimpleFactory;

public abstract class Jucator {
    private String nume;
    private int salariu;

    public Jucator(String nume, int salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    public String getNume() {
        return nume;
    }

    public Jucator setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public int getSalariu() {
        return salariu;
    }

    public Jucator setSalariu(int salariu) {
        this.salariu = salariu;
        return this;
    }

    public abstract void afiseazaJucator();
}
