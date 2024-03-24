package pregatireTestSingleton.ModulCursElevi;

public class Main {
    public static void main(String[] args) {
        RegistruElevi registruElevi = RegistruElevi.getInstance();
        registruElevi.adaugaElev(new Elev("Andrei",159));
        registruElevi.adaugaElev(new Elev("Lucian",123));

        System.out.println(registruElevi.getElev(159));
        System.out.println(registruElevi.getElev(123));
    }
}
