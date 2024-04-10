package BileteClase;

public abstract class BiletAbstract {
    private String echipaGazda;
    private String echipaOaspete;
    private double pretBilet;

    public BiletAbstract(String echipaGazda, String echipaOaspete, double pretBilet) {
        this.echipaGazda = echipaGazda;
        this.echipaOaspete = echipaOaspete;
        this.pretBilet = pretBilet;
    }

    public String echipaGazda() {
        return echipaGazda;
    }

    public void setEchipaGazda(String echipaGazda) {
        this.echipaGazda = echipaGazda;
    }

    public String echipaOaspete() {
        return echipaOaspete;
    }

    public void setEchipaOaspete(String echipaOaspete) {
        this.echipaOaspete = echipaOaspete;
    }

    public double pretBilet() {
        return pretBilet;
    }

    public void setPretBilet(double pretBilet) {
        this.pretBilet = pretBilet;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BiletAbstract{");
        sb.append("echipaGazda='").append(echipaGazda).append('\'');
        sb.append(", echipaOaspete='").append(echipaOaspete).append('\'');
        sb.append(", pretBilet=").append(pretBilet);
        sb.append('}');
        return sb.toString();
    }
    public abstract void printeazaBilet();
}
