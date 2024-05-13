package Comportamental.Observer.meci;

public class SalaDeSport extends Subiect{
    @Override
    public void notificaMeciFotbal(String data) {
        super.notificaClient("Stimate client,\nIn data de " + data + " va avea loc meciul de fotbal.\nTe asteptam cu drag!");
        System.out.println("\n");
    }

    @Override
    public void notificaMeciHandbal(String data) {
        super.notificaClient("Stimate client,\nIn data de " + data + " va avea loc meciul de handbal.\nTe asteptam cu drag!");
        System.out.println("\n");
    }

    @Override
    public void notificaMeciVolei(String data) {
        super.notificaClient("Stimate client,\nIn data de " + data + " va avea loc meciul de volei.\nTe asteptam cu drag!");
        System.out.println("\n");
    }
}
