package Structural.Adapter.main;

import Structural.Adapter.clase.aplicatieNoua.AplicatieNoua;
import Structural.Adapter.clase.aplicatieVeche.Adapter;
import Structural.Adapter.clase.aplicatieVeche.AplicatieVeche;
import Structural.Adapter.clase.aplicatieVeche.Medicament;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AplicatieVeche aplicatieVeche = new AplicatieVeche();
        Map<Medicament,Integer> map = new HashMap<>();
        Medicament medicament1 = new Medicament(123, "Paracetamol");
        Medicament medicament2 = new Medicament(125,"Nurofen");
        map.put(medicament1,123);
        map.put(medicament2,125);
        aplicatieVeche.stareMedicament(123);


        boolean disponibilitateVeche = aplicatieVeche.verificareDisponibilitate(10);
        System.out.println("Disponibilitatea medicamentelor in aplicatia veche este " + disponibilitateVeche);

        AplicatieNoua aplicatieNoua = new AplicatieNoua();

        Adapter adapter = new Adapter(aplicatieNoua);
        boolean disponibilitateAdapter = adapter.verificareDisponibilitate(10);
        System.out.println("Disponibilitatea medicamentului in aplicatia noua cu adapter este " + disponibilitateAdapter);
    }
}
