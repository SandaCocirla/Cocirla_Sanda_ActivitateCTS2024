package Structural.Proxy.clase;

public class ProxyAutobuz implements AutobuzAbstract  {
    private final AutobuzAbstract autobuzAbstract;


    private static int nrMinimDePersoane;

    public ProxyAutobuz(AutobuzAbstract autobuzAbstract) {
        this.autobuzAbstract = autobuzAbstract;

    }

    public static void setNrMinimDePersoane(int nrMinimDePersoane) {
        ProxyAutobuz.nrMinimDePersoane = nrMinimDePersoane;
    }

    @Override
    public void opresteInStatie(EvidentaCalatori evidentaCalatori) {
        if(nrMinimDePersoane > 0){
           autobuzAbstract.opresteInStatie(evidentaCalatori);
        }else{
            System.out.println("Autobuzul se retrage la autobaza");
        }
    }
}
