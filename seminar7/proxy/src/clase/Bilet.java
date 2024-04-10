package clase;

public class Bilet implements BiletAbstract{
    private String echipaGazda;
    private String echipaOaspete;
    private double pretBilet;

    public Bilet(String echipaGazda, String echipaOaspete, double pretBilet) {
        this.echipaGazda = echipaGazda;
        this.echipaOaspete = echipaOaspete;
        this.pretBilet = pretBilet;
    }


    @Override
    public void vanzareBilet(Client client) {
        System.out.println(client.nume() + " a cumparat bilet la meciul dintre "+ this.echipaGazda + " si "+this.echipaOaspete);
    }
}
