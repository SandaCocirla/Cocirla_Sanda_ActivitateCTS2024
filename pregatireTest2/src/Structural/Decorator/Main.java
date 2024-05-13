package Structural.Decorator;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> mapProduse = new HashMap<>();
        mapProduse.put("Somon cu sos alb",45.5);
        mapProduse.put("Suc fresh de portocale",15.0);
        mapProduse.put("Cheesecake",30.0);

        NotaDePlataAbstract notaDePlataAbstract = new NotaDePlata(mapProduse);
        System.out.println("Nota de plata");
        imprimareNotaDePlata(notaDePlataAbstract);

        DecoratorNotaDePlata notaDePlata = new NotaDePlataDeSarbatoare(notaDePlataAbstract);
        imprimareNotaDePlata(notaDePlata);

    }
    public static void imprimareNotaDePlata(NotaDePlataAbstract notaDePlataAbstract){
        notaDePlataAbstract.printeazaNota();
    }
}
