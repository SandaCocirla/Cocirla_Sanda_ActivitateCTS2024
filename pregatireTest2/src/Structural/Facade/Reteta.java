package Structural.Facade;

import java.util.List;
import java.util.Map;

public class Reteta {
    private CardDeSanatate cardDeSanatate;
    private int id;
    private Map<Medicament,Integer> medicamente;

    public int id() {
        return id;
    }

    public Map<Medicament, Integer> medicamente() {
        return medicamente;
    }

    public Reteta(CardDeSanatate cardDeSanatate, int id, Map<Medicament, Integer> medicamente) {
        this.cardDeSanatate = cardDeSanatate;
        this.id = id;
        this.medicamente = medicamente;
    }

    public CardDeSanatate cardDeSanatate() {
        return cardDeSanatate;
    }
}
