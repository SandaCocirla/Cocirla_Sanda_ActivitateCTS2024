package clase;

import java.util.ArrayList;
import java.util.List;

public class ProxyBiletSector implements BiletAbstract{
    private BiletAbstract biletAbstractSector;
    private static List<Character> listaLitere = new ArrayList<>();
    @Override
    public void vanzareBilet(Client client) {
        if(listaLitere.contains(client.nume().charAt(0))){
            this.biletAbstractSector.vanzareBilet(client);
        }else{
            System.out.println("Trebuie sa cumparat bilet la sectorul care incepe cu litera prenumelui");
        }
    }

    public ProxyBiletSector(BiletAbstract biletAbstractSector) {
        this.biletAbstractSector = biletAbstractSector;
    }
    public static void adaugaLitere(Character caracter){
        listaLitere.add(caracter);
    }
}
