package Structural.Facade;

import java.util.List;
import java.util.Map;

public class Farmacie {
    private Map<Integer, Reteta> mapRetete;
    private Map<Medicament, Integer> stocMedicamente;
    private List<CardDeSanatate> carduriDeSanatate;

    public Farmacie(Map<Integer, Reteta> mapRetete, Map<Medicament, Integer> stocMedicamente, List<CardDeSanatate> carduriDeSanatate) {
        this.mapRetete = mapRetete;
        this.stocMedicamente = stocMedicamente;
        this.carduriDeSanatate = carduriDeSanatate;
    }

    public boolean verificaValiditateReteta(Reteta reteta){
        return mapRetete.containsKey(reteta.id());
    }
    public boolean verificaStocMedicamente(Medicament medicament,int nrMedicamenteNecesare){
        int stoc = stocMedicamente.get(medicament);
        return nrMedicamenteNecesare<stoc;
    }
    public boolean verificaCardDeSanatate(CardDeSanatate card){
        return carduriDeSanatate.contains(card);
    }
}
