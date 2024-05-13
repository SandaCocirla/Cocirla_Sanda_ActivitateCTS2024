package Comportamental.Observer.meci;

import Comportamental.Observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    List<Observer> listaObserveri;

    public Subiect() {
        this.listaObserveri = new ArrayList<>();
    }
    public void adaugaClient(Observer observer){
        listaObserveri.add(observer);
    }
    public void stergeClient(Observer observer){
        listaObserveri.remove(observer);
    }
    public void notificaClient(String mesaj){
        for(Observer client : listaObserveri){
            client.trimiteNotificareMeci(mesaj);
        }
    }

    abstract public void notificaMeciFotbal(String data);
    abstract public void notificaMeciHandbal(String data);
    abstract public void notificaMeciVolei(String data);
}
