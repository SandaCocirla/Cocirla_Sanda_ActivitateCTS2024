package Structural.Flyweight.clase;

public class Cont {
    private int numarCont;
    private double suma;

    public Cont(int numarCont, double suma) {
        this.numarCont = numarCont;
        this.suma = suma;
    }

    public int getNumarCont() {
        return numarCont;
    }

    public double getSuma() {
        return suma;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cont{");
        sb.append("numarCont=").append(numarCont);
        sb.append(", suma=").append(suma);
        sb.append('}');
        return sb.toString();
    }
}
