package pregatireTestSingleton.ModulCursCopii;

public class Copil {
    private final String nume;
    private final String prenume;
    private final int codCopil;

    protected Copil(String nume, String prenume, int codCopil) {
        this.nume = nume;
        this.prenume = prenume;
        this.codCopil = codCopil;
    }

    public int getCodCopil() {
        return codCopil;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Copil{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", prenume='").append(prenume).append('\'');
        sb.append(", codCopil=").append(codCopil);
        sb.append('}');
        return sb.toString();
    }
}
