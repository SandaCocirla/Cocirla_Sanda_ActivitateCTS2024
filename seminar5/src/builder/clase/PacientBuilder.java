package builder.clase;

public class PacientBuilder implements AbstractBuilder {
    private Pacient pacient;

    public PacientBuilder(String numePacient) {
        this.pacient = new Pacient();
        pacient.setNume(numePacient);
    }

    @Override
    public AbstractBuilder adaugaPatRabatabil() {
        pacient.setArePatRabatabil(true);
        return this;
    }

    @Override
    public AbstractBuilder adaugaMicDejunInclus() {
        pacient.setAreMicDejunInclus(true);
        return this;
    }

    @Override
    public AbstractBuilder adaugaPapuciDeCamera() {
        pacient.setArePapuciDeCamera(true);
        return this;
    }

    @Override
    public AbstractBuilder adaugaHalatPentruInterior() {
        pacient.setAreHalatPentruInterior(true);
        return this;
    }



    @Override
    public Pacient build() {

        return pacient;
    }


}
