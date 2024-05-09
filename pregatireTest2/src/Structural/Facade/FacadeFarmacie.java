package Structural.Facade;

import java.util.List;
import java.util.Map;

public class FacadeFarmacie {
    Farmacie farmacie;

    public FacadeFarmacie(Farmacie farmacie) {
        this.farmacie = farmacie;
    }

    public boolean verificaConditiiReteta(Reteta reteta){
        boolean existaReteta = farmacie.verificaValiditateReteta(reteta);
        boolean esteCardulValid = farmacie.verificaCardDeSanatate(reteta.cardDeSanatate());
        boolean suntMedicamenteleDisponibile = true;
        for(Map.Entry<Medicament,Integer> entry :reteta.medicamente().entrySet()){
            Medicament m = entry.getKey();
            Integer stoc = entry.getValue();
            suntMedicamenteleDisponibile = suntMedicamenteleDisponibile && farmacie.verificaStocMedicamente(m,stoc);
        }
        return existaReteta && esteCardulValid && suntMedicamenteleDisponibile;
   }

}
