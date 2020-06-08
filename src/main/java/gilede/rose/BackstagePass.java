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
        if ( sellIn >= 5) {
            setValue(value + 2);
        }
        this.sellIn -= 1;
    }
}
