package Comportamental.Observer.main;

import Comportamental.Observer.meci.SalaDeSport;
import Comportamental.Observer.meci.Subiect;
import Comportamental.Observer.observer.ClientAbonat;
import Comportamental.Observer.observer.Observer;

public class Main {
    public static void main(String[] args) {
        Subiect salaDeSport = new SalaDeSport();


        Observer clientAbonat1 = new ClientAbonat("Daniel");
        Observer clientAbonat2 = new ClientAbonat("Marcel");
        Observer clientAbonat3 = new ClientAbonat("Andreea");
        Observer clientAbonat4 = new ClientAbonat("Laura");
        Observer clientAbonat5 = new ClientAbonat("Fabian");

        salaDeSport.adaugaClient(clientAbonat1);
        salaDeSport.adaugaClient(clientAbonat2);
        salaDeSport.adaugaClient(clientAbonat3);
        salaDeSport.adaugaClient(clientAbonat4);
        salaDeSport.adaugaClient(clientAbonat5);

        salaDeSport.notificaMeciFotbal("11 Mai");
        System.out.println("______________________________________\n");
        salaDeSport.notificaMeciVolei("22 Iunie");
    }
}
