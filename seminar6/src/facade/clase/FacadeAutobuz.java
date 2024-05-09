package facade.clase;

public class FacadeAutobuz {
    private Autobuz autobuz;

    public FacadeAutobuz(Autobuz autobuz) {
        this.autobuz = autobuz;
    }
    public void punePeLiberToateUsile(){
        this.autobuz.puneLiberUsaDinFata();
        this.autobuz.puneLiberUsaDinMijloc();
        this.autobuz.puneLiberUsaDinSpate();
    }

    public void deschideToateUsile(){
        this.autobuz.deschideUsaDinFata();
        this.autobuz.deschideUsaDinMijloc();
        this.autobuz.deschideUsaDinSpate();
    }
}
