package model.animale;

public class Zookeeper {
    private String nume;

    public Zookeeper(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public Zookeeper setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public void hranesteAnimal(Vietate vietate, String mancare){
        vietate.eat(mancare);
    }
}
