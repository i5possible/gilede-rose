package gilede.rose;

public class BackstagePass extends Product {

    public BackstagePass(int sellIn, int value) {
        super(sellIn, value);
    }

    @Override
    public void oneDayElapsed() {
        if (sellIn >= 10) {
            setValue(value + 1);
        }
        this.sellIn -= 1;
    }
}
