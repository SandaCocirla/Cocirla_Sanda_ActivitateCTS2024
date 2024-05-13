package Comportamental.Strategy.clase;

public class CardCalatorii implements ModPlata{
    @Override
    public void plateste(int suma, String nume) {
        System.out.println(nume + " achita cu cardul de calatorii biletul in valoare de " + suma + " lei." );
    }
}
