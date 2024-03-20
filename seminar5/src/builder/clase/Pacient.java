package builder.clase;

import java.util.StringJoiner;

public class Pacient {
    private String nume;

    private boolean arePatRabatabil;

    private boolean areMicDejunInclus;
    private boolean arePapuciDeCamera;
    private boolean areHalatPentruInterior;

    protected Pacient() {

    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    public void setAreMicDejunInclus(boolean areMicDejunInclus) {
        this.areMicDejunInclus = areMicDejunInclus;
    }

    public void setArePapuciDeCamera(boolean arePapuciDeCamera) {
        this.arePapuciDeCamera = arePapuciDeCamera;
    }

    public void setAreHalatPentruInterior(boolean areHalatPentruInterior) {
        this.areHalatPentruInterior = areHalatPentruInterior;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Pacient.class.getSimpleName() + "[", "]")
                .add("nume='" + nume + "'")
                .add("arePatRabatabil=" + arePatRabatabil)
                .add("areMicDejunInclus=" + areMicDejunInclus)
                .add("arePapuciDeCamera=" + arePapuciDeCamera)
                .add("areHalatPentruInterior=" + areHalatPentruInterior)
                .toString();
    }
}
