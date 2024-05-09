package Structural.Adapter.clase.aplicatieVeche;

import Structural.Adapter.clase.aplicatieNoua.AplicatieNoua;

public class Adapter implements AplicatieVecheInterface{
    private AplicatieNoua aplicatieNoua;

    public Adapter(AplicatieNoua aplicatieNoua) {
        this.aplicatieNoua = aplicatieNoua;
    }

    @Override
    public void stareMedicament(int id) {
    }

    @Override
    public boolean verificareDisponibilitate(int nrMedicamente) {
        return aplicatieNoua.verificăStocPentruMedicament(123,nrMedicamente);
    }
}
