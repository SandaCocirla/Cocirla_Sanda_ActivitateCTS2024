package Structural.Facade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Medicament, Integer> mapMedicamente = new HashMap<>();
        CardDeSanatate cardDeSanatate = new CardDeSanatate(445,"Dani","Maria");
        Medicament medicament1 = new Medicament("Paracetamol",12);
        Medicament medicament2 = new Medicament("Nurofen",45);
        mapMedicamente.put(medicament1,56);
        mapMedicamente.put(medicament2,25);

        Reteta reteta = new Reteta(cardDeSanatate,1623,mapMedicamente);
        reteta.id();
        reteta.cardDeSanatate();
        reteta.medicamente();


        Map<Integer, Reteta> retetaMap = new HashMap<>();
        retetaMap.put(reteta.id(), reteta);

        Map<Medicament,Integer> mapFarmacie = new HashMap<>();
        mapFarmacie.put(medicament1,60);
        mapFarmacie.put(medicament2,30);

        List<CardDeSanatate> listaCarduri = new ArrayList<>();
        CardDeSanatate cardDeSanatate2 = new CardDeSanatate(445,"Dani","Maria");
        listaCarduri.add(cardDeSanatate2);

        Farmacie farmacie = new Farmacie(retetaMap,mapFarmacie,listaCarduri);

        System.out.println("\nFacade\n");
        FacadeFarmacie facadeFarmacie = new FacadeFarmacie(farmacie);
        System.out.println(facadeFarmacie.verificaConditiiReteta(reteta));
    }
}
