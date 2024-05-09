package adapter.main;

import adapter.softNou.Bautura;
import adapter.softVechi.*;
import adapter.softNou.Bar;


public class Main {
    public static void platesteConsumatie(SoftBucatarie comanda){
        comanda.printBon();
    }
    public static void main(String[] args) {
        SoftBucatarie bucatarie = new Bucatarie();
        Produs produs = new Produs("Pizza",52);
        Produs produs1 = new Produs("Paste",45);
        Produs produs3 = new Produs("Lasagna",35);
        bucatarie.adaugaProdus(produs);
        bucatarie.adaugaProdus(produs1);
        bucatarie.adaugaProdus(produs3);
        platesteConsumatie(bucatarie);

        Bar bar = new Bar();
        bar.adaugaBautura(new Bautura(12,"Cola",0));
        bar.adaugaBautura(new Bautura(25,"Mojito",25.5F));

        AdapterComandaBarBucatarie bar1 = new AdapterComandaBarBucatarie();
        bar1.adaugaBautura(new Bautura(20,"Cola",0));
        bar1.adaugaBautura(new Bautura(15,"Pepsi",0));
        bar1.adaugaBautura(new Bautura(17,"Sprite",0));

        Bautura bautura = new Bautura(5,"Apa",0);
        AdapterBauturaProdus produs4 = new AdapterBauturaProdus(bautura);
        bar1.adaugaProdus(produs4);

        platesteConsumatie(bar1);
    }
}
