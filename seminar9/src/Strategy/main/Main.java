package Strategy.main;

import Strategy.clase.Cash;
import Strategy.clase.Client;

public class Main {
    public static void main(String[] args) {
        Client client1=new Client("Ion");
        client1.realizeazaPlata(10);
        client1.setMetodaPlata(new Cash());
        client1.realizeazaPlata(20);
    }

}
