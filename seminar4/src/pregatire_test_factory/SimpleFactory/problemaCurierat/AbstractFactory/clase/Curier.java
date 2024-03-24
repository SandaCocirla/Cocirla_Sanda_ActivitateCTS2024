package pregatire_test_factory.SimpleFactory.problemaCurierat.AbstractFactory.clase;

public class Curier {
   public Pachet livreazaPachet(TipPachet tipPachet, FactoryServiciuDeCurierat factoryServiciuDeCurierat) throws Exception{
        try{
            Pachet pachet1 = factoryServiciuDeCurierat.impacheteazaPachet(tipPachet);
            return pachet1;
        }catch(Exception e){
            e.printStackTrace();
            throw new Exception("Nu s-a putut livra pachetul");
        }
   }


}
