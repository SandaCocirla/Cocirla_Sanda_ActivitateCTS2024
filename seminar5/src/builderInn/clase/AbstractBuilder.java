package builderInn.clase;

public interface AbstractBuilder {

    public abstract AbstractBuilder adaugaPatRabatabil(boolean arePatRabatabil);
    public abstract AbstractBuilder adaugaMicDejunInclus(boolean areMicDejunInclus);
    public abstract AbstractBuilder adaugaPapuciDeCamera(boolean arePapuciDeCamera);
    public abstract AbstractBuilder adaugaHalatPentruInterior(boolean areHalatPentruInterior);

    public abstract Pacient build();

}
