package builderInn.clase;

import java.util.StringJoiner;

public class Pacient {
    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean arePapuciDeCamera;
    private boolean areHalatPentruInterior;

    protected Pacient() {

    }
    public Pacient(String nume, boolean arePatRabatabil, boolean areMicDejunInclus, boolean arePapuciDeCamera, boolean areHalatPentruInterior) {
        this.nume = nume;
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejunInclus = areMicDejunInclus;
        this.arePapuciDeCamera = arePapuciDeCamera;
        this.areHalatPentruInterior = areHalatPentruInterior;
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
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", arePatRabatabil=").append(arePatRabatabil);
        sb.append(", areMicDejunInclus=").append(areMicDejunInclus);
        sb.append(", arePapuciDeCamera=").append(arePapuciDeCamera);
        sb.append(", areHalatPentruInterior=").append(areHalatPentruInterior);
        sb.append('}');
        return sb.toString();
    }

    public static class PacientBuilder implements AbstractBuilder {

        private String nume;
        private boolean arePatRabatabil;
        private boolean areMicDejunInclus;
        private boolean arePapuciDeCamera;
        private boolean areHalatPentruInterior;

        public PacientBuilder(String nume) {
            this.nume = nume;
        }

        @Override
        public AbstractBuilder adaugaPatRabatabil(boolean arePatRabatabil) {
            this.arePatRabatabil = arePatRabatabil;
            return this;
        }

        @Override
        public AbstractBuilder adaugaMicDejunInclus(boolean areMicDejunInclus) {
            this.areMicDejunInclus = areMicDejunInclus;
            return this;
        }

        @Override
        public AbstractBuilder adaugaPapuciDeCamera(boolean arePapuciDeCamera) {
            this.arePapuciDeCamera = arePapuciDeCamera;
            return this;
        }

        @Override
        public AbstractBuilder adaugaHalatPentruInterior(boolean areHalatPentruInterior) {
            this.areHalatPentruInterior=areHalatPentruInterior;
            return this;
        }

        @Override
        public Pacient build() {
            return new Pacient(this.nume, this.arePatRabatabil, this.areMicDejunInclus, this.arePapuciDeCamera, this.areHalatPentruInterior);
        }

    }
}

