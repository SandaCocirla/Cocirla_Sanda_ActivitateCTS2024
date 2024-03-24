package pregatireTestSingleton.problemaSingletonConturi;

import java.util.HashMap;
import java.util.Map;

public class ConturiClienti {

    private final Map<String, NewContClient> conturiClienti;
    private static ConturiClienti instanta =null;

    private ConturiClienti(){
        this.conturiClienti = new HashMap<>();
    }
    public NewContClient getCont(String numeClient){
        return this.conturiClienti.get(numeClient);
    }

    public synchronized static ConturiClienti getInstance(){
        if(instanta==null){
            instanta = new ConturiClienti();
        }
        return instanta;
    }

    public void adaugareConturiClienti(String nume, String prenume, int varsta){
        if(!this.conturiClienti.containsKey(nume)){
            this.conturiClienti.put(nume,new NewContClient(nume,prenume,varsta));
        }
    }
}
