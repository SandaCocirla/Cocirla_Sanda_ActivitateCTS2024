package BileteDecoratoare;

import BileteClase.BiletAbstract;

public class BiletNational extends DecoratorBilet{
    private static double valoareDiscount = 0.8;
    public BiletNational(String echipaGazda, String echipaOaspete, double pretBilet) {
        super(echipaGazda, echipaOaspete, pretBilet);
    }

    public BiletNational(BiletAbstract biletDecorat) {
        super(biletDecorat);
    }

    @Override
    public void printeazaBilet() {
        this.biletAbstract().printeazaBilet();
        System.out.println( this.echipaGazda()+ " mult succes!");
    }

    @Override
    public void aplicaDiscount() {
        this.setPretBilet(this.biletAbstract().pretBilet()*valoareDiscount);
    }
}
