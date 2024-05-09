package Structural.Adapter.clase.aplicatieVeche;

public class Medicament {
    private int id;
    private String denumire;

    public Medicament(int id, String denumire) {
        this.id = id;
        this.denumire = denumire;
    }

    public int getId() {
        return id;
    }

    public String getDenumire() {
        return denumire;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medicament{");
        sb.append("id=").append(id);
        sb.append(", denumire='").append(denumire).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
