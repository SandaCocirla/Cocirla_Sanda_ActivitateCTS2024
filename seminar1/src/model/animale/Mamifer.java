package model.animale;

public abstract class Mamifer implements Vietate {

    private String nume;
    private int varsta;
    private int nrPicioare;

    public Mamifer(String nume, int varsta, int nrPicioare) {
        this.nume = nume;
        this.varsta = varsta;
        this.nrPicioare = nrPicioare;
    }

    public String getNume() {
        return nume;
    }

    public Mamifer setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public int getVarsta() {
        return varsta;
    }

    public Mamifer setVarsta(int varsta) {
        this.varsta = varsta;
        return this;
    }

    public int getNrPicioare() {
        return nrPicioare;
    }

    public Mamifer setNrPicioare(int nrPicioare) {
        this.nrPicioare = nrPicioare;
        return this;
    }

    @Override
    public void eat(String mancare) {

    }
}
