package pregatire_test_factory.SimpleFactory.problemaCurierat.SimpleFactory.clase;

public class FactoryServiciuDeCurierat {
    public Pachet impacheteazaPachet(TipPachet tipPachet) throws Exception{
        switch(tipPachet){
            case pachetMic:
                return new PachetMic();
            case pachetMediu:
                return new PachetMediu();
            case pachetMare:
                return new PachetMare();
            default:
                throw new Exception("Dimensiune pachet invalida");
        }
    }
}
