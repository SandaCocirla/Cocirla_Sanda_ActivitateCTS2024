package model;

import singleton.Guvern;

public class Program {
    public static void main(String[] args) {
        Guvern guvern = Guvern.getInstance(6,"Andrei",10);
        Guvern guvern2 = Guvern.getInstance(7,"Cristian",20);
        System.out.println(guvern);
        System.out.println(guvern2);
    }
}
