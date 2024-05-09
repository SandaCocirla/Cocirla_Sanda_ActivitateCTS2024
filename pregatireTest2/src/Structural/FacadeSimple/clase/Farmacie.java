package Structural.FacadeSimple.clase;

import java.util.List;
import java.util.Map;

public class Farmacie {
    private Map<String, Integer> stocMedicamente;
    private List<Integer> reteteInSistem;
    private List<Integer> carduriInSistem;

    public Farmacie(Map<String, Integer> stocMedicamente, List<Integer> reteteInSistem, List<Integer> carduriInSistem) {
        this.stocMedicamente = stocMedicamente;
        this.reteteInSistem = reteteInSistem;
        this.carduriInSistem = carduriInSistem;
    }

    public boolean verificaReteta(Integer codReteta){
        return reteteInSistem.contains(codReteta);
    }
    public boolean verificaStocMedicamente(String denumireMedicament, int numarMedicamente){
        int stoc = stocMedicamente.get(denumireMedicament);
        return stoc>=numarMedicamente;
    }
    public boolean verificaCardDeSanatate(Integer card){
        return carduriInSistem.contains(card);
    }
}
