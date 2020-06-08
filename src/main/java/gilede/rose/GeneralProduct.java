package gilede.rose;

public class GeneralProduct extends Product{

    public GeneralProduct(int sellIn, int value) {
        super(sellIn, value);
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
        ensureValueNotLessThanZero();
    }

    private void ensureValueNotLessThanZero() {
        if (value < 0) {
            value = 0;
        }
    }
}
