package Structural.Composite.clase;

public class Loc implements StructuraArborescenta{
    private int numar;
    private float pret;

    public Loc(int numar, float pret) {
        this.numar = numar;
        this.pret = pret;
    }

    public int getNumar() {
        return numar;
    }

    public float getPret() {
        return pret;
    }

    @Override
    public void afiseazaNumarLoc(String identare) {
        System.out.println(identare + "*-* Locul cu numarul " + this.numar + " are pretul " + this.pret);
    }

    @Override
    public void adaugaSectiune(StructuraArborescenta sa) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeSectiune(StructuraArborescenta sa) {
        throw new UnsupportedOperationException();
    }

    @Override
    public double calculeazaVenit() {
        double suma =0.0;
        suma += this.pret;
        return suma;
    }
}
