package Structural.Decorator;

import java.util.Map;

public abstract class NotaDePlataAbstract {
    private Map<String, Double> mapProduse;

    public NotaDePlataAbstract(Map<String, Double> mapProduse) {
        this.mapProduse = mapProduse;
    }

    public Map<String, Double> getMapProduse() {
        return mapProduse;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\nNota de plata\n");
        sb.append(mapProduse);
        return sb.toString();
    }
    public abstract void printeazaNota();

}
