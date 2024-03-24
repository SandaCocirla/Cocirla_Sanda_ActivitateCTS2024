package pregatire_test_factory.SimpleFactory.problemaCurierat.FactoryMethod.clase;

public class FactoryPachetMediu extends FactoryPachete {
    @Override
    public Pachet impacheteazaPachet(){
        return new PachetMediu();
    }
}
