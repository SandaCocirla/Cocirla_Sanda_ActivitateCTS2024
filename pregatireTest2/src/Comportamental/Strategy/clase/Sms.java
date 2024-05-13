package Comportamental.Strategy.clase;

public class Sms implements ModPlata{
    @Override
    public void plateste(int suma, String nume) {
        System.out.println(nume + " achita prin SMS biletul in valoare de " + suma + " lei.");
    }
}
