package BileteClase;

public class Bilet extends BiletAbstract{
    public Bilet(String echipaGazda, String echipaOaspete, double pretBilet) {
        super(echipaGazda, echipaOaspete, pretBilet);
    }

    @Override
    public void printeazaBilet() {
        System.out.println(this.toString());
    }
}
