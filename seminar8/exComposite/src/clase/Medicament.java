package clase;

public class Medicament implements StructuraAbstracta{
    //nodul frunza
    private String numeMedicament;
    private Double pret;

    public Medicament(String numeMedicament, Double pret) {
        this.numeMedicament = numeMedicament;
        this.pret = pret;
    }

    public String numeMedicament() {
        return numeMedicament;
    }

    public Double pret() {
        return pret;
    }

    @Override
    public void adaugareCategorie(StructuraAbstracta sa) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeCategorie(StructuraAbstracta sa) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StructuraAbstracta getCategorie(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afisareProspect(String indentare) {
        System.out.println(indentare + "*-* Medicamentul cu numele " + this.numeMedicament + " are pretul de " + this.pret);
    }

    @Override
    public void calculeazaPret(double procentDiscount) {
        this.pret = this.pret*(1-procentDiscount);
    }
}
