package singleton;

import java.util.StringJoiner;

public class Guvern {
    private int nrGuvernatori;
    private String numePrimMinistru;
    private int nrLuni;

    private static Guvern instanta = null;
    //la Singleton mereu constructor privat
    private Guvern(int nrGuvernatori, String numePrimMinistru, int nrLuni) {
        this.nrGuvernatori = nrGuvernatori;
        this.numePrimMinistru = numePrimMinistru;
        this.nrLuni = nrLuni;
    }

    public Guvern setNrGuvernatori(int nrGuvernatori) {
        this.nrGuvernatori = nrGuvernatori;
        return this;
    }

    public Guvern setNumePrimMinistru(String numePrimMinistru) {
        this.numePrimMinistru = numePrimMinistru;
        return this;
    }

    public Guvern setNrLuni(int nrLuni) {
        this.nrLuni = nrLuni;
        return this;
    }

    //synchronized e specific pentru threadsafe
    public synchronized static Guvern getInstance(int nrGuvernatori, String numePrimMinistru, int nrLuni){
        if(instanta==null){
            instanta = new Guvern(nrGuvernatori, numePrimMinistru, nrLuni);
        }
        return instanta;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Guvern.class.getSimpleName() + "[", "]")
                .add("nrGuvernatori=" + nrGuvernatori)
                .add("numePrimMinistru='" + numePrimMinistru + "'")
                .add("nrLuni=" + nrLuni)
                .toString();
    }
}
