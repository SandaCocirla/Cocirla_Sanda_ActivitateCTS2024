package Structural.Decorator;

public class NotaDePlataDeSarbatoare extends DecoratorNotaDePlata{

    public NotaDePlataDeSarbatoare(NotaDePlataAbstract notaDePlataDecorata) {
        super(notaDePlataDecorata);
    }

    @Override
    public void adaugaMesajDeFelicitare() {
        System.out.println("La Multi Ani!");
    }

    @Override
    public void printeazaNota() {
        System.out.println(this.getNotaAbstracta().toString());
        adaugaMesajDeFelicitare();
    }
}
