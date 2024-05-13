package state.src.main;

import state.src.clase.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta = new Reteta(4,75,1);
        reteta.cumparareMedicamente();
        reteta.cerereMedicamente();
        reteta.cumparareMedicamente();
        Reteta retetaRespinsa = new Reteta(5,100,2);
        retetaRespinsa.cerereMedicamente();
        retetaRespinsa.respingeReteta();
    }
}
