package SimpleFactory.clase;

public class Brancardier extends PersonalSpital{
    public Brancardier(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisare() {
        System.out.println("Bancardierul "+super.getNume()+ "are salariul de "+super.getSalariu());
    }
}
