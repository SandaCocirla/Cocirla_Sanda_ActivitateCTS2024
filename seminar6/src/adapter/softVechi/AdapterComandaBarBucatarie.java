package adapter.softVechi;

import adapter.softNou.Bar;
import adapter.softNou.Bautura;

public class AdapterComandaBarBucatarie extends Bar implements SoftBucatarie {


    @Override
    public void printBon() {
        super.printareNotaDePlata();
    }

    @Override
    public void adaugaProdus(Produs produs) {
        Bautura b = new Bautura(produs.pret(), produs.denumire(), 0);
        super.adaugaBautura(b);
    }
}
