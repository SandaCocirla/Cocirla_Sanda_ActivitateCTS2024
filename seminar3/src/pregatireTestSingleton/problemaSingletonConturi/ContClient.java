package pregatireTestSingleton.problemaSingletonConturi;

public class ContClient {

    private String nume;
    private String prenume;
    private int varsta;
    private static ContClient instanta= null;

    private ContClient(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public synchronized static ContClient getInstance(String nume, String prenume, int varsta){
        if(instanta==null){
            instanta = new ContClient(nume,prenume,varsta);
        }
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContClient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", prenume='").append(prenume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }
}
