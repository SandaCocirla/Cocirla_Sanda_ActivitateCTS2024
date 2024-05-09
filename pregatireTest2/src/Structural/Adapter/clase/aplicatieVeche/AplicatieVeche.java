package Structural.Adapter.clase.aplicatieVeche;

import java.util.HashMap;
import java.util.Map;

public class AplicatieVeche implements AplicatieVecheInterface{
    private Map<Medicament, Integer> mapMedicamente;

    public AplicatieVeche(){
        this.mapMedicamente = new HashMap<>();
    }

    public Map<Medicament, Integer> getMapMedicamente() {
        return mapMedicamente;
    }

    @Override
    public void stareMedicament(int id) {
        System.out.println("Medicamentul cu codul " + id + " a fost setat in aplicatia veche");
    }

    @Override
    public boolean verificareDisponibilitate(int nrMedicamente) {
       if(nrMedicamente>0){
           System.out.println("Medicamentele sunt disponibile in aplicatia veche");
           return true;
       }else{
           System.out.println("Medicamentele nu sunt disponibile in aplicatia veche");
           return false;
       }
    }
}
