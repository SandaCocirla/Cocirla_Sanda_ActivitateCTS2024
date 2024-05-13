package Comportamental.Observer.observer;

public class ClientAbonat implements Observer {
    private String numeClient;

    public ClientAbonat(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void trimiteNotificareMeci(String mesaj) {
        System.out.println(numeClient + " a primit mesajul:\n"+ mesaj + "\n" );
    }
}
