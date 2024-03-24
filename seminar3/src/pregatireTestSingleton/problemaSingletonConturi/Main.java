package pregatireTestSingleton.problemaSingletonConturi;

public class Main {
    public static void main(String[] args) {
        ConturiClienti conturiClienti = ConturiClienti.getInstance();
        conturiClienti.adaugareConturiClienti("Purice","Ion",45);
        conturiClienti.adaugareConturiClienti("Dinu","Alina",26);
        conturiClienti.adaugareConturiClienti("Dinu","vrajescu",28);

        System.out.println(conturiClienti.getCont("Purice"));
        System.out.println(conturiClienti.getCont("Dinu"));
    }
}
