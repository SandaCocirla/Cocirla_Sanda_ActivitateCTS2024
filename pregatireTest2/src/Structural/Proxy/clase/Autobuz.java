package Structural.Proxy.clase;

public class Autobuz implements AutobuzAbstract{
    private final int nrCursa;
    public Autobuz(int nrCursa) {
        this.nrCursa = nrCursa;
    }

    public int getNrCursa() {
        return nrCursa;
    }

    @Override
    public void opresteInStatie(EvidentaCalatori evidentaCalatori) {
            System.out.println("Autobuzul " + this.nrCursa + " opreste in statie");
    }
}
