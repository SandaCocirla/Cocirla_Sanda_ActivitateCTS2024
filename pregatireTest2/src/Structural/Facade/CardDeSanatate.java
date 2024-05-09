package Structural.Facade;

import java.util.Objects;

public class CardDeSanatate {
    private int cod;
    private String nume;
    private String prenume;

    public CardDeSanatate(int cod, String nume, String prenume) {
        this.cod = cod;
        this.nume = nume;
        this.prenume = prenume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CardDeSanatate)) return false;
        CardDeSanatate that = (CardDeSanatate) o;
        return cod == that.cod;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cod);
    }
}
