package Structural.Flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    Map<Integer,Flyweight> listaClienti;

    public FlyweightFactory() {
        this.listaClienti = new HashMap<>();
    }
    public Flyweight getClient(int codUnic, String numeClient, String email, String telefon){
        if(!listaClienti.containsKey(codUnic)){
            listaClienti.put(codUnic, new Client(numeClient,email,telefon));
        }
        return listaClienti.get(codUnic);
    }
}
