package clase;

public class ProxyBilet implements BiletAbstract{
    private BiletAbstract biletAbstract;
    private static int varstaMinima = 14;

    public static void setVarstaMinima(int varstaMinima) {
        ProxyBilet.varstaMinima = varstaMinima;
    }

    public ProxyBilet(BiletAbstract biletAbstract) {
        this.biletAbstract = biletAbstract;
    }

    @Override
    public void vanzareBilet(Client client) {
        if(client.varsta()>=14){
            this.biletAbstract.vanzareBilet(client);
        }
        else{
            System.out.println("Nu ai voie sa cumperi bilet!");
        }
    }
}
