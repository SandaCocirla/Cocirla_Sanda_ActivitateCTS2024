package pregatireTestSingleton.SesiuniUtilizator;

import java.util.HashMap;
import java.util.Map;

public class RegistrySesiune {
    private final Map<Integer, Sesiune> registrySesiuni = new HashMap<>();
    private static RegistrySesiune instanta = null;

    private RegistrySesiune(){
    }

    public synchronized static RegistrySesiune getInstance(){
        if(instanta==null){
            instanta = new RegistrySesiune();
        }
        return instanta;
    }

    public Sesiune getSesiune(int codSesiune){
        return registrySesiuni.get(codSesiune);
    }

    public void adaugaSesiuni(Sesiune sesiune){
        if(!registrySesiuni.containsKey(sesiune.getNumarSesiune())){
            registrySesiuni.put(sesiune.getNumarSesiune(),sesiune);
        }
    }
}
