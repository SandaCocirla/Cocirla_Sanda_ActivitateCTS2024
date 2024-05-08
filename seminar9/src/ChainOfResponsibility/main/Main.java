package ChainOfResponsibility.main;

import ChainOfResponsibility.clase.Client;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Gigel");
        client.realizeazaPlata(20);
        client.realizeazaPlata(20);
        client.realizeazaPlata(20);
        client.realizeazaPlata(20);
        client.realizeazaPlata(20);
        client.realizeazaPlata(20);
        client.realizeazaPlata(20);
    }
}
