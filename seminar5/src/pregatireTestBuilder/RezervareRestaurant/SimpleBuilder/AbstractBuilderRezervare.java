package pregatireTestBuilder.RezervareRestaurant.SimpleBuilder;

public interface AbstractBuilderRezervare {
    public abstract AbstractBuilderRezervare adaugaAsezareLaGeam();
    public abstract AbstractBuilderRezervare adaugaScauneErgonomice();
    public abstract AbstractBuilderRezervare adaugaDecorareaMesei();
    public abstract AbstractBuilderRezervare adaugaMuzicaAmbientalaPersonalizata();
    public abstract AbstractBuilderRezervare adaugaGenMuzica();

    public abstract Rezervare build();
}
