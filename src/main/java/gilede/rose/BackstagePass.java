package gilede.rose;

public class BackstagePass extends Product {

    public BackstagePass(int sellIn, int value) {
        super(sellIn, value);
    }

    @Override
    public void oneDayElapsed() {
        this.sellIn -= 1;
        if (sellIn >= 9) {
            setValue(value + 1);
        } else if (sellIn >= 4) {
            setValue(value + 2);
        } else if (sellIn > 0) {
            setValue(value + 3);
        } else if (sellIn < 0) {
            setValue(0);
        }
    }
}
