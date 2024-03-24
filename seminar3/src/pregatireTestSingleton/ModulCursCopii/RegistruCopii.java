package pregatireTestSingleton.ModulCursCopii;

import java.util.HashMap;
import java.util.Map;

public class RegistruCopii {
    private final Map<Integer,Copil> registruCopii = new HashMap<>();
    private static RegistruCopii instanta = null;

    public Copil getCopil(int codCopil){
        return registruCopii.get(codCopil);
    }
    public void adaugaCopil(Copil copil){
        int codCopil = copil.getCodCopil();
        if(!registruCopii.containsKey(codCopil)) {
            registruCopii.put(codCopil,copil);
        }
    }

    private RegistruCopii(){}

    public synchronized static RegistruCopii getInstance(){
        if(instanta==null){
            instanta = new RegistruCopii();
        }
        return instanta;
    }

}
