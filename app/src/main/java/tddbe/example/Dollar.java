package tddbe.example;

public class Dollar {
    public int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(multiplier * amount);
    }
}
