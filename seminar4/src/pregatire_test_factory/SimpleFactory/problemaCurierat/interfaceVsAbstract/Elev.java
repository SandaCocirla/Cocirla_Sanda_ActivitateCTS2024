package pregatire_test_factory.SimpleFactory.problemaCurierat.interfaceVsAbstract;

public class Elev extends Copil {

    private Director director;

    Elev(Director director) {
        this.director = director;
    }

    @Override
    public void faCiorbita() {
        System.out.println("Elevul face ciorbita");
        verificaOrarul();

    };

    public void verificaOrarul() {
        director.intocmesteOrarul();
    }

}
