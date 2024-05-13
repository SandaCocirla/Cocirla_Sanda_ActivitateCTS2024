package Comportamental.State.main;

import Comportamental.State.clase.Loc;

public class Main {
    public static void main(String[] args) {
        Loc loc1 = new Loc(1,"a");
        loc1.rezerveazaLoc();
        loc1.ocupaLoc();

        loc1.elibereazaLoc();
    }
}
