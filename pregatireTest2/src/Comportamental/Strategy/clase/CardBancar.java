package Comportamental.Strategy.clase;

public class CardBancar implements ModPlata{
    @Override
    public void plateste(int suma, String nume) {
        System.out.println(nume + " achita cu cardul bancar biletul in valoare de " + suma + " lei." );
    }
}
