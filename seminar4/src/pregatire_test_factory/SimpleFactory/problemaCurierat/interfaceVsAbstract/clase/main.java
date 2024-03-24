package pregatire_test_factory.SimpleFactory.problemaCurierat.interfaceVsAbstract.clase;

public class main {
    public static void main(String[] args) {
        PersonalSpital ps = new Asistent("Gigi", 100);
        Curatenie c = getRandom();
        c.faCurat();
        PersonalSpital ps2 = new Brancardier("Gigi", 100);
        PersonalSpital ps3 = new Medic("Gigi", 100);
        PersonalSpital ps4 = new Infirmier("Gigi", 100);
    }

    static Curatenie getRandom() {
        if ((int)(Math.random() * 100) % 2 == 0) {
            return new Asistent("Gigi", 100);
        } else {
            return new Brancardier("Gigi", 100);
        }
    }
}
