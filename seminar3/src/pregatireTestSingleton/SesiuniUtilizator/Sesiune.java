package pregatireTestSingleton.SesiuniUtilizator;

public class Sesiune {
    private String numeUtilizator;
    private int numarSesiune;

    public Sesiune(String numeUtilizator, int numarSesiune) {
        this.numeUtilizator = numeUtilizator;
        this.numarSesiune = numarSesiune;
    }

    public int getNumarSesiune() {
        return numarSesiune;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sesiune{");
        sb.append("numeUtilizator='").append(numeUtilizator).append('\'');
        sb.append(", numarSesiune=").append(numarSesiune);
        sb.append('}');
        return sb.toString();
    }
}
