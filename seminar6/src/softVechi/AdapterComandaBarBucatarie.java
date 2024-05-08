package softVechi;

import softNou.Bar;
import softNou.Bautura;

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
