package gilede.rose;

public class Product {

    private int sellIn;
    private int value;

    public Product(int sellIn, int value) {
        this.sellIn = sellIn;
        this.value = Math.min(value, 50);
    }

    public int getValue() {
        return value;
    }

    public void oneDayElapsed() {
        this.sellIn -= 1;
        if (sellIn < 0) {
            value -= 2;
        } else {
            value -= 1;
        }
    }
}
