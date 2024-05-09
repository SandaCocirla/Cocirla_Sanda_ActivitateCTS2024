package adapter.softNou;

import java.util.ArrayList;
import java.util.List;

public class Bar {
    private List<Bautura> listaBauturi;

    public Bar(){
        this.listaBauturi = new ArrayList<>();
    }

    public List<Bautura> listaBauturi() {
        return listaBauturi;
    }
    public void adaugaBautura(Bautura bautura){
        this.listaBauturi.add(bautura);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bar{");
        sb.append("listaBauturi=").append(listaBauturi);
        sb.append('}');
        return sb.toString();
    }

    public void printareNotaDePlata(){
        float total = 0;
        System.out.println("Lista de bauturi: ");
        for(Bautura bautura: listaBauturi){
            System.out.println(bautura.toString());
            total+= bautura.pret();
        }
        System.out.println("________________________________");
        System.out.println("Totalul bauturilor este: "+total+"\n");
    }
}
