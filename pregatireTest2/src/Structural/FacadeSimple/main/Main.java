package Structural.FacadeSimple.main;

import Structural.FacadeSimple.clase.FacadeFarmacie;
import Structural.FacadeSimple.clase.Farmacie;
import Structural.FacadeSimple.clase.Reteta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> medicamentePrescrire = new HashMap<>();
        medicamentePrescrire.put("Paracetamol",2);
        medicamentePrescrire.put("Nurofen",3);

        Reteta reteta = new Reteta(123,medicamentePrescrire,1345);
        Reteta reteta2 = new Reteta(124,medicamentePrescrire,1349);

        Map<String, Integer> medicamenteInSistem  = new HashMap<>();
        medicamenteInSistem.put("Paracetamol",20);
        medicamenteInSistem.put("Nurofen",12);

        List<Integer> coduriCardInSistem = new ArrayList<>();
        coduriCardInSistem.add(1345);
        coduriCardInSistem.add(1156);

        List<Integer> reteteInSistem = new ArrayList<>();
        reteteInSistem.add(123);
        reteteInSistem.add(128);
        Farmacie farmacie = new Farmacie(medicamenteInSistem,reteteInSistem,coduriCardInSistem);

        FacadeFarmacie facadeFarmacie = new FacadeFarmacie(farmacie);
        boolean verificaReteta = facadeFarmacie.verificaCriteriiReteta(reteta2);
        System.out.println(verificaReteta);

    }
}
