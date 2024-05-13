package Structural.Decorator;

import java.util.Map;

public class NotaDePlata extends NotaDePlataAbstract{


    public NotaDePlata(Map<String, Double> mapProduse) {
        super(mapProduse);
    }

    @Override
    public void printeazaNota() {
        System.out.println(this.getMapProduse().toString());
    }
}
