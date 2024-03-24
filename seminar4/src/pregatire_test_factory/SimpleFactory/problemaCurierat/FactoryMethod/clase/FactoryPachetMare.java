package pregatire_test_factory.SimpleFactory.problemaCurierat.FactoryMethod.clase;

public class FactoryPachetMare extends FactoryPachete {
    @Override
    public Pachet impacheteazaPachet(){
        return new PachetMare();
    }
}
