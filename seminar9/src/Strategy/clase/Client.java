package Strategy.clase;

public class Client {
    private String nume;
    private ModPlata modPlata;

    public Client(String nume){
        this.nume = nume;
        this.modPlata = new Card();
    }
    public void realizeazaPlata(int suma){

        modPlata.plateste(suma, nume);
    }

    public void setMetodaPlata(ModPlata modPlata) {

        this.modPlata = modPlata;
    }
    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
