package adapter.softNou;

public class Bautura {
    private float pret;
    private String denumire;
    private float gradAlcool;

    public Bautura(float pret, String denumire, float gradAlcool) {
        this.pret = pret;
        this.denumire = denumire;
        this.gradAlcool = gradAlcool;
    }

    public float pret() {
        return pret;
    }

    public String denumire() {
        return denumire;
    }

    public float gradAlcool() {
        return gradAlcool;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bautura{");
        sb.append("pret=").append(pret);
        sb.append(", denumire='").append(denumire).append('\'');
        sb.append(", gradAlcool=").append(gradAlcool);
        sb.append('}');
        return sb.toString();
    }
}
