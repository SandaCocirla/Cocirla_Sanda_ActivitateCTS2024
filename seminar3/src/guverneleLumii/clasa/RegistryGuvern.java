package guverneleLumii.clasa;

import java.util.HashMap;
import java.util.Map;

public class RegistryGuvern {
    private  Map<String, Guvern> guverneleLumii;

    private static RegistryGuvern instanta=null;

    private RegistryGuvern() {
        this.guverneleLumii = new HashMap<>();
    }
    public Guvern getGuvern(String numeTara){
        return this.guverneleLumii.get(numeTara);
    }

    public synchronized static RegistryGuvern getInstance(){
        if(instanta==null){
            instanta=new RegistryGuvern();
        }
        return instanta;
    }
    //metoda care sa inregistreze un guvern
    public void adaugaGuvern(String numeTara, String numePrimMinistru, int nrGuvernatori){
        if(!this.guverneleLumii.containsKey(numeTara)){
            this.guverneleLumii.put(numeTara,new Guvern(numeTara,numePrimMinistru,nrGuvernatori));
        }
    }

}
