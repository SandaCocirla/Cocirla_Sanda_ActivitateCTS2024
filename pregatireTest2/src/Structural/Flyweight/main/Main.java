package Structural.Flyweight.main;

import Structural.Flyweight.clase.Banca;
import Structural.Flyweight.clase.Cont;
import Structural.Flyweight.clase.Flyweight;
import Structural.Flyweight.clase.FlyweightFactory;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Cont cont1 = new Cont(1254,500);
        //Cont cont4 = new Cont(1254,500);
        Cont cont2 = new Cont(1255,1500);
        Cont cont3 = new Cont(1256,6500);
        Banca banca1 = new Banca("BRD","Victoriei");
        Banca banca2 = new Banca("BT", "Romana");

        Flyweight client = factory.getClient(1115,"Alina Fota", "afota@gmail.com","0758114445");
        client.retineInformatiiCont(cont1,banca1);
        factory.getClient(1115,"Alina Fota","afota@gmail.com","0758114445").retineInformatiiCont(cont2,banca1);
    }
}
