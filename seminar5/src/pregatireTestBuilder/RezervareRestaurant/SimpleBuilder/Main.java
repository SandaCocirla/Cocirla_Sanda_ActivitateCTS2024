package pregatireTestBuilder.RezervareRestaurant.SimpleBuilder;

public class Main {
    public static void main(String[] args) {
        AbstractBuilderRezervare abstractBuilderRezervare = new RezervareBuilder("Andrei");
        Rezervare rezervare = abstractBuilderRezervare.adaugaAsezareLaGeam().adaugaScauneErgonomice().adaugaMuzicaAmbientalaPersonalizata().build();
        System.out.println(rezervare);
    }
}
