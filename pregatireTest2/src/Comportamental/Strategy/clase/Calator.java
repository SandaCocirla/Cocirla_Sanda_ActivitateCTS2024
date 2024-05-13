package Comportamental.Strategy.clase;

public class Calator {
    private String nume;
    private ModPlata modPlata;

    public Calator(String nume) {
        this.nume = nume;
        this.modPlata = new CardCalatorii();
    }

    public void realizeazaPlata(int suma){
        modPlata.plateste(suma,nume);
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Calator{");
        sb.append("nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
