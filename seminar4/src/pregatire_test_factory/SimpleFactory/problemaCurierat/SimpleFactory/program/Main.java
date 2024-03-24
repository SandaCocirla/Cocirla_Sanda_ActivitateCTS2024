package pregatire_test_factory.SimpleFactory.problemaCurierat.SimpleFactory.program;

import pregatire_test_factory.SimpleFactory.problemaCurierat.SimpleFactory.clase.Pachet;
import pregatire_test_factory.SimpleFactory.problemaCurierat.SimpleFactory.clase.TipPachet;
import pregatire_test_factory.SimpleFactory.problemaCurierat.SimpleFactory.clase.Curier;
import pregatire_test_factory.SimpleFactory.problemaCurierat.SimpleFactory.clase.FactoryServiciuDeCurierat;

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
