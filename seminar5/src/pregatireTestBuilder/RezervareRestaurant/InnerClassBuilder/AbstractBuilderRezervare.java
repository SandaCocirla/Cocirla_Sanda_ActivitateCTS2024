package pregatireTestBuilder.RezervareRestaurant.InnerClassBuilder;

public interface AbstractBuilderRezervare {

    public abstract AbstractBuilderRezervare adaugaAsezareLaGeam(boolean asezareLaGeam);
    public abstract AbstractBuilderRezervare adaugaScauneErgonomice(boolean scauneErgonomice);
    public abstract AbstractBuilderRezervare adaugaDecorareaMesei(boolean decorareaMesei);
    public abstract AbstractBuilderRezervare adaugaMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata);
    public abstract AbstractBuilderRezervare adaugaGenMuzica(boolean genMuzica);

    public abstract  Rezervare build();
}
