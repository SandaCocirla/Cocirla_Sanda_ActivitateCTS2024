package pregatireTestSingleton.ModulCursCopii;

public class Main {
    public static void main(String[] args) {
        RegistruCopii registru = RegistruCopii.getInstance();
        registru.adaugaCopil(new Copil("Bazan","Anca",123));
        registru.adaugaCopil(new Copil("Chican","Maria",156));

        System.out.println(registru.getCopil(123));
        System.out.println(registru.getCopil(156));
    }
}
