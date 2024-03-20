package prototype.program;

import builderInn.clase.AbstractBuilder;
import prototype.clase.AbstractReteta;
import prototype.clase.Reteta;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> hartaIngrediente = new HashMap<>();
        hartaIngrediente.put("GVB",0.5);
        hartaIngrediente.put("Vitamina D",10.0);
        hartaIngrediente.put("Vitamina C",12.0);
        Reteta reteta = new Reteta("Mig4000",hartaIngrediente,22.5);
        AbstractReteta reteta1 = reteta.cloneaza();
        AbstractReteta reteta2 = reteta1.cloneaza();
        reteta2.setNumeMedicament("Altceva");
        System.out.println(reteta);
        System.out.println(reteta1);
        System.out.println(reteta2);
    }
}
