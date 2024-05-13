package Comportamental.Template.clase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Template {
    //private Map<Integer, String> mese;
    private List<Integer> listaMese = List.of(1,2,3,4,5);

    public Template() {
        /*this.mese = new HashMap<>();
        mese.put(1," masa");
        mese.put(2," masa");
        mese.put(3," masa");
        mese.put(4," masa");
        mese.put(5," masa");*/
    }

    protected abstract void curataMasa();
    protected abstract void aseazaServetele();
    protected abstract void aseazaTacamuri();


    public final void invitaPersoaneSaSeAsezeLaMasa(int nrMasa){
        if(listaMese.contains(nrMasa)) {
            curataMasa();
            aseazaServetele();
            aseazaTacamuri();
            System.out.println("Va invitam la masa numarul " + nrMasa + "\n");
        }else{
            System.out.println("Nu exista locuri la masa");
        }
    }
}
