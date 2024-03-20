package exemplu_pregatire_test.clase;

public class Singleton {

    private final static Singleton instance;

    static {
        instance = new Singleton();
    }

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

    public static double processLotto() {
        return Math.random();
    }
}
