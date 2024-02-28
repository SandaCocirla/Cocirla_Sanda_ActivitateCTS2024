package main;

import model.animale.Leu;
import model.animale.Maimuta;
import model.animale.Zebra;
import model.animale.Zookeeper;
import model.zoo.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Zoo Bucuresti",new Zookeeper("Andrei"),null);
        Leu leu = new Leu("Martin",10, 4);
        zoo.adaugaAnimale(leu,"carne de vita");
        Zebra zebra = new Zebra("Zabo", 6,4);
        zoo.adaugaAnimale(zebra,"fan");
        zoo.adaugaAnimale(new Maimuta("Julian",3,4),"banane");
        zoo.hranesteToateAnimalele();
    }
    public enum tipuriAnimale{
        LEU,
        MAIMUTA,
        ZEBRA
    }
}
