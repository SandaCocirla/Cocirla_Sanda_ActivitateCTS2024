package guverneleLumii.clasa;

import java.util.StringJoiner;

public class Guvern {
    private String numeTara;
    private String numePrimMinistru;
    private int nrGuvernatori;

    protected Guvern(String numeTara, String numePrimMinistru, int nrGuvernatori) {
        this.numeTara = numeTara;
        this.numePrimMinistru = numePrimMinistru;
        this.nrGuvernatori = nrGuvernatori;
    }

    public Guvern setNumeTara(String numeTara) {
        this.numeTara = numeTara;
        return this;
    }

    public Guvern setNumePrimMinistru(String numePrimMinistru) {
        this.numePrimMinistru = numePrimMinistru;
        return this;
    }

    public Guvern setNrGuvernatori(int nrGuvernatori) {
        this.nrGuvernatori = nrGuvernatori;
        return this;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Guvern.class.getSimpleName() + "[", "]")
                .add("numeTara='" + numeTara + "'")
                .add("numePrimMinistru='" + numePrimMinistru + "'")
                .add("nrGuvernatori=" + nrGuvernatori)
                .toString();
    }
}
