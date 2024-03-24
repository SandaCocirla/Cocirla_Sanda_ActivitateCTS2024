package pregatireTestSingleton.SesiuniUtilizator;

import java.util.StringJoiner;

public class SesiuneSingleton {
    private String numeUtilizator;
    private int numarSesiune;

    private static SesiuneSingleton instanta = null;

    private SesiuneSingleton(String numeUtilizator, int numarSesiune) {
        this.numeUtilizator = numeUtilizator;
        this.numarSesiune = numarSesiune;
    }
    //lazy initialization + thread safe
    public synchronized static SesiuneSingleton getInstance(String numeUtilizator, int numarSesiune){
        if(instanta==null){
            instanta = new SesiuneSingleton(numeUtilizator, numarSesiune);
        }
        return instanta;
    }

    //pentru afisare la consola
    @Override
    public String toString() {
        return new StringJoiner(", ", SesiuneSingleton.class.getSimpleName() + "[", "]")
                .add("numeUtilizator='" + numeUtilizator + "'")
                .add("numarSesiune=" + numarSesiune)
                .toString();
    }
}
