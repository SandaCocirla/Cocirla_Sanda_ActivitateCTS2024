package pregatireTestBuilder.RezervareRestaurant.SimpleBuilder;

public class RezervareBuilder implements AbstractBuilderRezervare{
    private Rezervare rezervare;

    public RezervareBuilder(String numeClient){
        this.rezervare = new Rezervare();
        rezervare.setNume(numeClient);
    }


    @Override
    public AbstractBuilderRezervare adaugaAsezareLaGeam() {
        rezervare.setAsezareLaGeam(true);
        return this;
    }

    @Override
    public AbstractBuilderRezervare adaugaScauneErgonomice() {
        rezervare.setScauneErgonomice(true);
        return this;
    }


    @Override
    public AbstractBuilderRezervare adaugaDecorareaMesei() {
        rezervare.setDecorareaMesei(true);
        return this;
    }

    @Override
    public AbstractBuilderRezervare adaugaMuzicaAmbientalaPersonalizata() {
        rezervare.setMuzicaAmbientalaPersonalizata(true);
        return this;
    }

    @Override
    public AbstractBuilderRezervare adaugaGenMuzica() {
        rezervare.setGenMuzica(true);
        return this;
    }

    @Override
    public Rezervare build() {
        return rezervare;
    }
}
