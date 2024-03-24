package pregatireTestBuilder.RezervareRestaurant.InnerClassBuilder;

public class Rezervare {
    private String numeClient;

    private boolean asezareLaGeam;
    private boolean scauneErgonomice;
    private boolean decorareaMesei;
    private boolean muzicaAmbientalaPersonalizata;
    private boolean genMuzica;

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setAsezareLaGeam(boolean asezareLaGeam) {
        this.asezareLaGeam = asezareLaGeam;
    }

    public void setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
    }

    public void setDecorareaMesei(boolean decorareaMesei) {
        this.decorareaMesei = decorareaMesei;
    }

    public void setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
    }

    public void setGenMuzica(boolean genMuzica) {
        this.genMuzica = genMuzica;
    }


    protected Rezervare() {
    }

    public Rezervare(String numeClient, boolean asezareLaGeam, boolean scauneErgonomice, boolean decorareaMesei,
                     boolean muzicaAmbientalaPersonalizata, boolean genMuzica) {
        this.numeClient = numeClient;
        this.asezareLaGeam = asezareLaGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorareaMesei = decorareaMesei;
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
        this.genMuzica = genMuzica;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", asezareLaGeam=").append(asezareLaGeam);
        sb.append(", scauneErgonomice=").append(scauneErgonomice);
        sb.append(", decorareaMesei=").append(decorareaMesei);
        sb.append(", muzicaAmbientalaPersonalizata=").append(muzicaAmbientalaPersonalizata);
        sb.append(", genMuzica=").append(genMuzica);
        sb.append('}');
        return sb.toString();
    }

    public static class BuilderRezervare implements AbstractBuilderRezervare {
        private String numeClient;
        private boolean asezareLaGeam;
        private boolean scauneErgonomice;
        private boolean decorareaMesei;
        private boolean muzicaAmbientalaPersonalizata;
        private boolean genMuzica;

        public BuilderRezervare(String numeClient){
            this.numeClient=numeClient;
        }

        @Override
        public AbstractBuilderRezervare adaugaAsezareLaGeam(boolean asezareLaGeam) {
            this.asezareLaGeam = asezareLaGeam;
            return this;
        }

        @Override
        public AbstractBuilderRezervare adaugaScauneErgonomice(boolean scauneErgonomice) {
            this.scauneErgonomice = scauneErgonomice;
            return this;
        }

        @Override
        public AbstractBuilderRezervare adaugaDecorareaMesei(boolean decorareaMesei) {
            this.decorareaMesei = decorareaMesei;
            return this;
        }

        @Override
        public AbstractBuilderRezervare adaugaMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
            this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
            return this;
        }

        @Override
        public AbstractBuilderRezervare adaugaGenMuzica(boolean genMuzica) {
            this.genMuzica = genMuzica;
            return this;
        }

        @Override
        public Rezervare build() {
            return new Rezervare(numeClient, this.asezareLaGeam, this.scauneErgonomice, this.decorareaMesei, this.muzicaAmbientalaPersonalizata, this.genMuzica);
        }
    }
}
