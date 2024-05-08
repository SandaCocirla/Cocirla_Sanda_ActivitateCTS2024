package Observer.main;

import Observer.observer.Client;
import Observer.observer.Observer;
import Observer.observer.Turist;
import Observer.restaurant.Restaurant;
import Observer.restaurant.SalaDeSport;
import Observer.restaurant.Subiect;

public class Main {
    public static void main(String[] args) {
        Subiect restaurant = new Restaurant("Str Mircea Badea 23");

        Observer client1 = new Client("Marcel");
        Observer client2 = new Client("Cristi");
        Observer client3 = new Client("Ana");
        Observer client4 = new Client("Alina");
        Observer client5 = new Client("Maria");

        restaurant.adaugaCLient(client1);
        restaurant.adaugaCLient(client2);
        restaurant.adaugaCLient(client3);
        restaurant.adaugaCLient(client4);
        restaurant.adaugaCLient(client5);

        restaurant.notificareEveniment("11 Seprembrie");

        restaurant.stergeClient(client1);
        restaurant.stergeClient(client5);
        restaurant.stergeClient(client3);

        restaurant.notificareSchimbareMeniu();

        restaurant.stergeClient(client2);
        restaurant.stergeClient(client5);

        restaurant.notificareSchimbarePret();

        Observer turist1 = new Turist();
        restaurant.adaugaCLient(turist1);

        restaurant.notificareEveniment("10 Iulie");

        Subiect salaSport = new SalaDeSport();
        salaSport.adaugaCLient(client1);
        salaSport.adaugaCLient(client2);
        salaSport.adaugaCLient(turist1);

        salaSport.notificareEveniment("10 Ianuarie");
        ((SalaDeSport)salaSport).notificareMeciVolei();
    }
}
