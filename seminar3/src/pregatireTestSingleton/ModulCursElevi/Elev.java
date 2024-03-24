package pregatireTestSingleton.ModulCursElevi;

public class Elev {
    private String nume;
    private int codElev;

    public Elev(String nume, int codElev) {
        this.nume = nume;
        this.codElev = codElev;
    }

    public int getCodElev() {
        return codElev;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Elev{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", codElev=").append(codElev);
        sb.append('}');
        return sb.toString();
    }
}
