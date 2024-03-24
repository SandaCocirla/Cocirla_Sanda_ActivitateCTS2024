package pregatireTestBuilder.RezervareRestaurant.InnerClassBuilder;

public class Main {
    public static void main(String[] args) {
        AbstractBuilderRezervare builder = new Rezervare.BuilderRezervare("Aurelia");
        Rezervare rezervare = builder.adaugaAsezareLaGeam(true).adaugaGenMuzica(true).build();
        System.out.println(rezervare);
    }
}
