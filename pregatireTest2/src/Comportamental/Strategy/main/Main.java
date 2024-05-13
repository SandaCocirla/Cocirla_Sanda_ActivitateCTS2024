package Comportamental.Strategy.main;

import Comportamental.Strategy.clase.Calator;
import Comportamental.Strategy.clase.CardBancar;
import Comportamental.Strategy.clase.Sms;

public class Main {
    public static void main(String[] args) {
        Calator calator1 = new Calator("Ana-Maria");
        calator1.realizeazaPlata(3);
        calator1.setModPlata(new CardBancar());
        calator1.realizeazaPlata(5);
        Calator calator2 = new Calator("Ion");
        calator2.setModPlata(new Sms());
        calator2.realizeazaPlata(7);
    }
}
