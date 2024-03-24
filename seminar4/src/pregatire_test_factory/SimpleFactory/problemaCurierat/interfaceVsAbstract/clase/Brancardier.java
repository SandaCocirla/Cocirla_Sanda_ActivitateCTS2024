package pregatire_test_factory.SimpleFactory.problemaCurierat.interfaceVsAbstract.clase;

public class Brancardier extends PersonalSpital implements Curatenie{

    public Brancardier(String nume, int salariu) {
        super(nume,salariu);
    }

    @Override
    public void faCurat() {
        System.out.println("FacC urat branca");
    }

    @Override
    public void afisare() {
        System.out.println("Brancardierul " + this.getNume() + " are salariul de " + this.getSalariu());
    }
}
