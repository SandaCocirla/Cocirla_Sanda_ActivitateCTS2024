package exemplu_pregatire_test.clase;

import java.util.StringJoiner;

public class Sesiune {
    private String numeUtilizator;
    private int numarSesiune;

    private static Sesiune instanta = null;

    public Sesiune setNumeUtilizator(String numeUtilizator) {
        this.numeUtilizator = numeUtilizator;
        return this;
    }

    public Sesiune setNumarSesiune(int numarSesiune) {
        this.numarSesiune = numarSesiune;
        return this;
    }

    private Sesiune(String numeUtilizator, int numarSesiune) {
        this.numeUtilizator = numeUtilizator;
        this.numarSesiune = numarSesiune;
    }
    public synchronized static Sesiune getInstance(String numeUtilizator, int numarSesiune){
        if(instanta==null){
            instanta = new Sesiune(numeUtilizator, numarSesiune);
        }
        return instanta;
    }

    //pentru afisare la consola
    @Override
    public String toString() {
        return new StringJoiner(", ", Sesiune.class.getSimpleName() + "[", "]")
                .add("numeUtilizator='" + numeUtilizator + "'")
                .add("numarSesiune=" + numarSesiune)
                .toString();
    }
}
