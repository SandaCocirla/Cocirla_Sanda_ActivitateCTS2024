package pregatire_test_factory.SimpleFactory.problemaCurierat.FactoryMethod.program;

import pregatire_test_factory.SimpleFactory.problemaCurierat.FactoryMethod.clase.FactoryPachetMare;
import pregatire_test_factory.SimpleFactory.problemaCurierat.FactoryMethod.clase.FactoryPachetMic;
import pregatire_test_factory.SimpleFactory.problemaCurierat.FactoryMethod.clase.FactoryPachete;
import pregatire_test_factory.SimpleFactory.problemaCurierat.FactoryMethod.clase.Pachet;

public class Main {

    public static void main(String[] args) {
     deschidePachetGeneric(new FactoryPachetMic());
     deschidePachetGeneric(new FactoryPachetMare());
     FactoryPachete factoryPachete = new FactoryPachetMic();

    }

    public static void deschidePachetGeneric(FactoryPachete factoryPachete){
        Pachet pachet = factoryPachete.impacheteazaPachet();
        pachet.deschidePachet();
    }


}
