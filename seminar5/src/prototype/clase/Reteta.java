package prototype.clase;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements AbstractReteta{
    private String numeMedicament;
    private Map<String,Double> compozitieMedicament;

    private Double gramaj;

    public void setNumeMedicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    public Reteta(String numeMedicament, Map<String, Double> compozitieMedicament, Double gramaj) {
        this.numeMedicament = numeMedicament;
        this.compozitieMedicament = compozitieMedicament;
        this.gramaj = gramaj;
        Double suma = 0.0;
        for(Double cantitate:compozitieMedicament.values()){
            suma = suma+cantitate;
        }
        if(suma<gramaj+0.1 && suma>gramaj+0.1){
            throw new RuntimeException("Gramaj incorect");
        }
    }

    private Reteta(){

    }
    @Override
    public AbstractReteta cloneaza() {
      Reteta reteta = new Reteta();
      reteta.numeMedicament = this.numeMedicament;
      reteta.compozitieMedicament = new HashMap<>();
      for(String cheie:compozitieMedicament.keySet()){
          reteta.compozitieMedicament.put(cheie,this.compozitieMedicament.get(cheie));
      }
      reteta.gramaj = this.gramaj;
      return reteta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("numeMedicament='").append(numeMedicament).append('\'');
        sb.append(", compozitieMedicament=").append(compozitieMedicament);
        sb.append(", gramaj=").append(gramaj);
        sb.append('}');
        return sb.toString();
    }
}
