package tddbe.example;

public class Dollar {
    public int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    public void times(int multiplier) {
        this.amount = multiplier * amount;
    }
}
