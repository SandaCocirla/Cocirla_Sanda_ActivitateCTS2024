package Comportamental.Template.clase;

import java.util.Map;

public class OcupareMasa extends Template{
    private int nrMasa;

    public OcupareMasa(int nrMasa) {
        super();
        this.nrMasa = nrMasa;
    }

    @Override
    protected void curataMasa() {
        System.out.println("Masa a fost curatata");
    }

    @Override
    protected void aseazaServetele() {
        System.out.println("Servetelele au fost asezate");
    }

    @Override
    protected void aseazaTacamuri() {
        System.out.println("Tacamurile au fost asezate");
    }
}
