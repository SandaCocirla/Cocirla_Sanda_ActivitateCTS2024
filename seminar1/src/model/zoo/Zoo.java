package model.zoo;

import model.animale.Mamifer;
import model.animale.Vietate;
import model.animale.Zookeeper;

import java.util.HashMap;
import java.util.Map;

public class Zoo {
    private String numeZoo;
    private Zookeeper ingrijitor;
    private Map<Vietate,String> animale;

    public Zoo(String numeZoo, Zookeeper ingrijitor, Map<Vietate, String> animale) {
        this.numeZoo = numeZoo;
        this.ingrijitor = ingrijitor;
        this.animale = animale;
    }
    public String getNumeZoo() {
        return numeZoo;
    }

    public Zoo setNumeZoo(String numeZoo) {
        this.numeZoo = numeZoo;
        return this;
    }

    public Zookeeper getIngrijitor() {
        return ingrijitor;
    }

    public Zoo setIngrijitor(Zookeeper ingrijitor) {
        this.ingrijitor = ingrijitor;
        return this;
    }

    public Map<Vietate, String> getAnimale() {
        return animale;
    }

    public Zoo setAnimale(Map<Vietate, String> animale) {
        this.animale = animale;
        return this;
    }

    public void adaugaAnimale(Vietate  vietate, String mancare){
        if(this.animale==null){
            this.animale = new HashMap<>();
        }
        if(vietate!=null && mancare.length()>2){
            this.animale.put(vietate, mancare);
        }

    }

    public void hranesteToateAnimalele(){
        for(Vietate vietate : animale.keySet()){
            ingrijitor.hranesteAnimal(vietate,animale.get(vietate));

        }
    }





}
