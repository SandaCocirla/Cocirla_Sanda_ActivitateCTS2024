package pregatireTestSingleton.ModulCursElevi;

import java.util.HashMap;
import java.util.Map;

public class RegistruElevi {
    private Map<Integer,Elev> registruElevi = new HashMap<>();
    private static RegistruElevi instanta = null;

    private RegistruElevi(){
    }

    public Elev getElev(int codElev){
        return registruElevi.get(codElev);
    }

    public synchronized static RegistruElevi getInstance(){
        if(instanta==null){
            instanta = new RegistruElevi();
        }
        return instanta;
    }

    public void adaugaElev(Elev elev){
        if(!registruElevi.containsKey(elev.getCodElev())){
            registruElevi.put(elev.getCodElev(),elev);
        }
    }
}
