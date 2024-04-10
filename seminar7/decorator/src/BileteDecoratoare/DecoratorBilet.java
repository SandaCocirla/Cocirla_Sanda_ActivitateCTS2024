package BileteDecoratoare;

import BileteClase.Bilet;
import BileteClase.BiletAbstract;

public abstract class DecoratorBilet extends BiletAbstract {
    public BiletAbstract biletAbstract() {
        return biletAbstract;
    }

    private BiletAbstract biletAbstract;
    public DecoratorBilet(String echipaGazda, String echipaOaspete, double pretBilet) {
        super(echipaGazda, echipaOaspete, pretBilet);
        this.biletAbstract = new Bilet(echipaGazda,echipaOaspete,pretBilet);
    }
    //un fel de constructor de copiere
    public DecoratorBilet(BiletAbstract biletDecorat) {
        super(biletDecorat.echipaGazda(), biletDecorat.echipaOaspete(), biletDecorat.pretBilet());
        this.biletAbstract = biletDecorat;
    }

    public abstract void aplicaDiscount();
}
