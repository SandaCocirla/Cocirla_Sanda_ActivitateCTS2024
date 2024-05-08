package ChainOfResponsibility.clase;

public class Card extends ModPlata{
    private int sold;

    public Card(int sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(int suma, String nume) {
        if(sold<suma){
            super.succesor.plateste(suma, nume);
        }else{
            System.out.println(nume+" a platit cu cardul");
            sold-=suma;
        }

    }
}
