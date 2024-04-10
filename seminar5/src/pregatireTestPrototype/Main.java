package pregatireTestPrototype;

public class Main {
    public static void main(String[] args) {
        Rezervare.adaugaRezervare("Rezervare1","Vali","alina.covala@gmail.com");
        Rezervare.adaugaRezervare("Rezervare2","Dinu","dinu@gmail.com");

        Rezervare rezervare1 = Rezervare.getRezervare("Rezervare1");
        if(rezervare1!=null){
            System.out.println("Rezervare realizata pentru " + rezervare1.getNume());
        }
        System.out.println("Nu exista client inregistrat");
    }
}
