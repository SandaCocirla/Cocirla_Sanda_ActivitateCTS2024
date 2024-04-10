package main;

import clase.*;

public class Main {
    public static void main(String[] args) {

        BiletAbstract biletAbstract = new Bilet("A","B",10);
        Client client = new Client("Popescu",13);
        biletAbstract.vanzareBilet(client);

        BiletAbstract biletAbstract1 = new ProxyBilet(biletAbstract);
        biletAbstract1.vanzareBilet(client);

        Client client3 = new Client("Gigel",18);
        biletAbstract1.vanzareBilet(client3);

        BiletAbstract bilet3 = new ProxyBiletSector(biletAbstract1);
        ProxyBiletSector.adaugaLitere('P');
        bilet3.vanzareBilet(client);
        bilet3.vanzareBilet(client3);

        System.out.println("_______________________________");
        BiletAbstract bilet4 = new ProxyBiletSector(biletAbstract);


    }
}
