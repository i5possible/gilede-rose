package gilede.rose;

public abstract class Product {
    protected int sellIn;
    protected int value;

    public Product(int sellIn, int value) {
        this.sellIn = sellIn;
        setValue(value);
    }

    abstract void oneDayElapsed();

    public void setValue(int value) {
        this.value = Math.min(value, 50);
    }

    public int getValue() {
        return value;
    }
}
