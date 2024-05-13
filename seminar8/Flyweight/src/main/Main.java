package main;

import clase.Flyweight;
import clase.FlyweightFactory;
import clase.Reteta;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Reteta reteta1 = new Reteta("reteta1",150,4);
        Reteta reteta2 = new Reteta("reteta2",110,3);
        Reteta reteta3 = new Reteta("reteta3",120,5);
        Reteta reteta4 = new Reteta("reteta4",130,4);

        Flyweight client = factory.getClient("1234567","Gigel");
        client.achizitionareReteta(reteta1);

        factory.getClient("1234567","Gigel").achizitionareReteta(reteta2);

        factory.getClient("8765421","Ionel").achizitionareReteta(reteta3);
        factory.getClient("8765421","Ionel").achizitionareReteta(reteta4);
    }
}
