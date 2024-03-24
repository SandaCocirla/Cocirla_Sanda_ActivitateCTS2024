package pregatireTestSingleton.SesiuniUtilizator;

public class Main {
    public static void main(String[] args) {
        //se creeaza o singura instanta
        SesiuneSingleton sesiune = SesiuneSingleton.getInstance("Maria",15);
        SesiuneSingleton sesiune2 = SesiuneSingleton.getInstance("Daniel",18);
        System.out.println(sesiune);
        System.out.println(sesiune2);

        RegistrySesiune registrySesiune = RegistrySesiune.getInstance();
        registrySesiune.adaugaSesiuni(new Sesiune("Daniela",19));
        registrySesiune.adaugaSesiuni(new Sesiune("Marinela",14));
        System.out.println(registrySesiune.getSesiune(19));
        System.out.println(registrySesiune.getSesiune(14));
    }
}
