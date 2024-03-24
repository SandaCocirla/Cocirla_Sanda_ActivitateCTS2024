package pregatire_test_factory.SimpleFactory.problemaCurierat.interfaceVsAbstract.clase;

public class Asistent extends PersonalSpital implements Curatenie {

    public Asistent(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void faCurat() {
        System.out.println("FacC urat asis");
    }

    @Override
    public void afisare() {
        System.out.println("Asistentul " + super.getNume() + " are salariul de " + super.getSalariu());
    }
}
