package Structural.Flyweight.clase;

public class Client implements Flyweight{
    private String numeClient;
    private int codUnic;
    private String email;
    private String nrTelefon;



    public Client(String numeClient, String email, String nrTelefon) {
        this.numeClient = numeClient;
        this.email = email;
        this.nrTelefon = nrTelefon;
    }

    @Override
    public void retineInformatiiCont(Cont cont, Banca banca) {
        System.out.println("Clientul " + this.numeClient + " are adresa de email " + this.email + " si numarul de telefon " + this.nrTelefon +
                 " de la banca " + banca.toString() + " are urmatoarele detalii de " + cont.toString());
    }
}
