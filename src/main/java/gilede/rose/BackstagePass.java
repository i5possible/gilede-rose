package gilede.rose;

public class BackstagePass extends Product{

    private int sellIn;
    private int value;

    public BackstagePass(int sellIn, int value) {
        super(sellIn, value);
    }

    @Override
    public void oneDayElapsed() {
    }
}
