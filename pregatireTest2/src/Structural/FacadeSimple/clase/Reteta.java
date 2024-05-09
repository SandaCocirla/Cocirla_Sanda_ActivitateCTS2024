package Structural.FacadeSimple.clase;


import java.util.Map;

public class Reteta {
    private int id;
    private Map<String, Integer> stocMedicamente;
    private int codCard;

    public Reteta(int id, Map<String, Integer> stocMedicamente, int codCard) {
        this.id = id;
        this.stocMedicamente = stocMedicamente;
        this.codCard = codCard;
    }

    public int id() {
        return id;
    }

    public Map<String, Integer> stocMedicamente() {
        return stocMedicamente;
    }

    public int codCard() {
        return codCard;
    }
}
