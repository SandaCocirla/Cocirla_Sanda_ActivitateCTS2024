package Structural.Proxy.main;

import Structural.Proxy.clase.Autobuz;
import Structural.Proxy.clase.AutobuzAbstract;
import Structural.Proxy.clase.EvidentaCalatori;
import Structural.Proxy.clase.ProxyAutobuz;

public class Main {
    public static void main(String[] args) {
        AutobuzAbstract autobuzAbstract = new Autobuz(368);
        EvidentaCalatori evidentaCalatori = new EvidentaCalatori(12);
        autobuzAbstract.opresteInStatie(evidentaCalatori);

        AutobuzAbstract autobuzAbstract1 = new ProxyAutobuz(autobuzAbstract);
        EvidentaCalatori evidentaCalatori1 = new EvidentaCalatori(0);
        autobuzAbstract1.opresteInStatie(evidentaCalatori1);
    }
}
