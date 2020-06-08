package gilede.rose;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneralProductTest {

    @Test
    public void shouldSetValueTo50IfLargerThan50() {
        final GeneralProduct generalProduct = new GeneralProduct(10, 100);

        assertThat(generalProduct.getValue()).isEqualTo(50);
    }
    
    @Test
    public void shouldDecreaseValueBy1EveryDay() {
        final GeneralProduct generalProduct = new GeneralProduct(10, 10);

        generalProduct.oneDayElapsed();

        assertThat(generalProduct.getValue()).isEqualTo(9);
    }
    
    @Test
    public void shouldDecreaseValueBy2IfTheSellInLessThanZero() {
        final GeneralProduct generalProduct = new GeneralProduct(0, 10);

        generalProduct.oneDayElapsed();

        assertThat(generalProduct.getValue()).isEqualTo(8);
    }

    @Test
    public void shouldSetTheValueToZeroIfTheValueIsLessThanZero() {
        final GeneralProduct generalProduct = new GeneralProduct(0, 0);

        generalProduct.oneDayElapsed();

        assertThat(generalProduct.getValue()).isEqualTo(0);
    }
}