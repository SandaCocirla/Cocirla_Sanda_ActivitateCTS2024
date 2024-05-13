package Structural.Decorator;

import java.util.Map;

public abstract class DecoratorNotaDePlata extends NotaDePlataAbstract {
    private NotaDePlataAbstract notaAbstracta;

    public NotaDePlataAbstract getNotaAbstracta() {
        return notaAbstracta;
    }

    public DecoratorNotaDePlata( Map<String, Double> mapProduse) {
        super(mapProduse);
        this.notaAbstracta = new NotaDePlata(mapProduse);
    }
    //un fel de constructor de copiere
    public DecoratorNotaDePlata(NotaDePlataAbstract notaDePlataDecorata){
        super(notaDePlataDecorata.getMapProduse());
        this.notaAbstracta = notaDePlataDecorata;
    }
    public abstract void adaugaMesajDeFelicitare();
}
