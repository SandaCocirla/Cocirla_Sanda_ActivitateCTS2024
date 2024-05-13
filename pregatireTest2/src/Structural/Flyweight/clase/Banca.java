package Structural.Flyweight.clase;

public class Banca {
    private String numeBanca;
    private String sucursala;

    public Banca(String numeBanca, String sucursala) {
        this.numeBanca = numeBanca;
        this.sucursala = sucursala;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Banca{");
        sb.append("numeBanca='").append(numeBanca).append('\'');
        sb.append(", sucursala='").append(sucursala).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
