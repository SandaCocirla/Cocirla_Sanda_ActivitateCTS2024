package adapter.softVechi;

import adapter.softNou.Bautura;

public class AdapterBauturaProdus extends Produs{
    private Bautura bautura;

    public AdapterBauturaProdus(Bautura bautura) {
        super(bautura.denumire(), bautura.pret());
        this.bautura = bautura;
    }
}
