package softVechi;

import java.util.ArrayList;
import java.util.List;

public class Bucatarie implements SoftBucatarie{
    private List<Produs> listaProduse;

    public Bucatarie() {
        this.listaProduse = new ArrayList<>();
    }

    public List<Produs> listaProduse() {
        return listaProduse;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bucatarie{");
        sb.append("listaProduse=").append(listaProduse);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void printBon() {
        System.out.println("Lista de produse este:");
        float total = 0;
        for(int i=0;i<listaProduse.size();i++){
            System.out.println("Produsul: "+listaProduse.get(i));
            total +=listaProduse.get(i).pret();
        }
        System.out.println("________________________________");
        System.out.println("Totalul bonului este: "+total+"\n");
    }

    @Override
    public void adaugaProdus(Produs produs) {
        this.listaProduse.add(produs);
    }
}
