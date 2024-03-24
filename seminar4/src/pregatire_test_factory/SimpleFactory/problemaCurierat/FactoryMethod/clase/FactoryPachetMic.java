package pregatire_test_factory.SimpleFactory.problemaCurierat.FactoryMethod.clase;

public class FactoryPachetMic extends FactoryPachete{
    @Override
    public Pachet impacheteazaPachet(){
        doSomething();
        return new PachetMic();
    }

    public void doSomething(){
        System.out.println("I am doing something");
    }
}
