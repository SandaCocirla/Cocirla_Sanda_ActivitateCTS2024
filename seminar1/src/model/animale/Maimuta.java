package model.animale;

public class Maimuta extends Mamifer{
    @Override
    public void eat(String mancare) {
        System.out.println("Maimuta "+getNume()+" mananca "+mancare);
    }

    public Maimuta(String nume, int varsta, int nrPicioare) {
        super(nume, varsta, nrPicioare);
    }
}
