package Comportamental.Template.main;

import Comportamental.Template.clase.OcupareMasa;

public class Main {
    public static void main(String[] args) {
        OcupareMasa masa = new OcupareMasa(1);
        masa.invitaPersoaneSaSeAsezeLaMasa(1);
        OcupareMasa masa2 = new OcupareMasa(2);
        masa2.invitaPersoaneSaSeAsezeLaMasa(2);
        masa.invitaPersoaneSaSeAsezeLaMasa(6);
    }
}
