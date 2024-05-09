package facade.main;

import facade.clase.Autobuz;
import facade.clase.FacadeAutobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz();
        autobuz.puneLiberUsaDinSpate();
        autobuz.deschideUsaDinSpate();
        FacadeAutobuz facadeAutobuz = new FacadeAutobuz(autobuz);
        System.out.println("\nCu FACADE\n");
        facadeAutobuz.deschideToateUsile();
        System.out.println("\n");
        facadeAutobuz.punePeLiberToateUsile();
    }
}
