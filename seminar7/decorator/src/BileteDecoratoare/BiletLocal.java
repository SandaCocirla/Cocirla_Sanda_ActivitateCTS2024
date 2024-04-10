package BileteDecoratoare;

import BileteClase.BiletAbstract;

public class BiletLocal extends DecoratorBilet{

    private double valoareDiscount = 0.9;
    public BiletLocal(String echipaGazda, String echipaOaspete, double pretBilet) {
        super(echipaGazda, echipaOaspete, pretBilet);
    }

    public BiletLocal(BiletAbstract biletDecorat) {
        super(biletDecorat);
    }

    @Override
    public void printeazaBilet() {
        System.out.println(this.toString());
        System.out.println("Hai ca poti " + this.echipaGazda());
    }

    @Override
    public void aplicaDiscount() {
        this.setPretBilet(this.biletAbstract().pretBilet()*valoareDiscount);
    }
}
