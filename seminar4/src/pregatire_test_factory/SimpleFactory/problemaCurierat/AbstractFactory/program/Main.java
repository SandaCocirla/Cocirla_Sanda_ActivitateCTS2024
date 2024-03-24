package pregatire_test_factory.SimpleFactory.problemaCurierat.AbstractFactory.program;

import pregatire_test_factory.SimpleFactory.problemaCurierat.AbstractFactory.clase.Curier;
import pregatire_test_factory.SimpleFactory.problemaCurierat.AbstractFactory.clase.FactoryServiciuDeCurierat;
import pregatire_test_factory.SimpleFactory.problemaCurierat.AbstractFactory.clase.Pachet;
import pregatire_test_factory.SimpleFactory.problemaCurierat.AbstractFactory.clase.TipPachet;

public class Main {
    public static void main(String[] args) {
        FactoryServiciuDeCurierat factoryServiciuDeCurierat = new FactoryServiciuDeCurierat();
        Curier curier1 = new Curier();
        try{
           Pachet pachet1 = curier1.livreazaPachet(TipPachet.pachetMic,factoryServiciuDeCurierat);
           pachet1.deschide();
           Pachet pachet2 = curier1.livreazaPachet(TipPachet.pachetMediu,factoryServiciuDeCurierat);
           pachet2.deschide();
        }catch(Exception e){
           e.printStackTrace();
       }
    }
}
