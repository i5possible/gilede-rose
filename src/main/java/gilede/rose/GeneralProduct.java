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
            setValue(value - 2);
        } else {
            setValue(value - 1);
        }
    }
}
