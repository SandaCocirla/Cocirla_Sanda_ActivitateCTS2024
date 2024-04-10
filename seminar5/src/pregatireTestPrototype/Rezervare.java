package pregatireTestPrototype;

import java.util.HashMap;
import java.util.Map;

public class Rezervare implements AbstractRezervare{
    private String nume;

    public String getNume() {
        return nume;
    }

    private String email;
    private static Map<String, Rezervare> prototipuriRezervari = new HashMap<>();

    public Rezervare(String nume, String email) {
        this.nume = nume;
        this.email = email;
    }
    private Rezervare(){}

    @Override
    public AbstractRezervare cloneaza() {
        Rezervare rezervare = new Rezervare();
        rezervare.nume = nume;
        rezervare.email = email;
        return rezervare;

    }
    //metoda de a crea si a adauga un prototip
    public static void adaugaRezervare(String numePrototip, String nume, String email){
        prototipuriRezervari.put(numePrototip, new Rezervare(nume,email));
    }
    //obtinerea unei rezervari a unui client clonate din map
    public static Rezervare getRezervare(String numePrototip){
        Rezervare prototip = prototipuriRezervari.get(numePrototip);
        if(prototip!=null){
            return (Rezervare) prototip.cloneaza();
        }
        return null;
    }

}
