package builder.clase;

public interface AbstractBuilder {

    public abstract AbstractBuilder adaugaPatRabatabil();
    public abstract AbstractBuilder adaugaMicDejunInclus();
    public abstract AbstractBuilder adaugaPapuciDeCamera();
    public abstract AbstractBuilder adaugaHalatPentruInterior();

    public abstract Pacient build();

}
