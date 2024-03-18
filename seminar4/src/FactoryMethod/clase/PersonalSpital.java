package FactoryMethod.clase;

public abstract class PersonalSpital {
    private String nume;
    private int salariu;

    public PersonalSpital(String nume, int salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    public abstract void afisare();

    public String getNume() {
        return nume;
    }

    public PersonalSpital setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public int getSalariu() {
        return salariu;
    }

    public PersonalSpital setSalariu(int salariu) {
        this.salariu = salariu;
        return this;
    }
}
