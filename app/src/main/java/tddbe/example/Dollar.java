package tddbe.example;

import java.util.Objects;

public class Dollar {
    public int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(multiplier * amount);
    }

    @Override
    public boolean equals(Object o) {
        Dollar other = (Dollar) o;
        return amount == other.amount;
    }
}
