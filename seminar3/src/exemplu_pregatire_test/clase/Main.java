package exemplu_pregatire_test.clase;

public class Main {
    public static void main(String[] args) {
        Singleton.processLotto();
        System.out.println("Se executa in main");
        //blablabla
        //blablabla
        //creezi doar cand ai nevoie de el
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());


    }
}
