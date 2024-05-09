package Structural.FacadeSimple.clase;



import java.util.Map;

public class FacadeFarmacie {
    Farmacie farmacie;

    public FacadeFarmacie(Farmacie farmacie) {
        this.farmacie = farmacie;
    }

    public boolean verificaCriteriiReteta(Reteta reteta){
        boolean retetaExista= farmacie.verificaReteta(reteta.id());
        boolean cardulExista = farmacie.verificaCardDeSanatate(reteta.codCard());
        boolean eStocSuficient = true;
        for(Map.Entry<String,Integer> entry : reteta.stocMedicamente().entrySet()){
            eStocSuficient = eStocSuficient && farmacie.verificaStocMedicamente(entry.getKey(),entry.getValue());
        }
        return retetaExista && cardulExista &&eStocSuficient;
    }
}
