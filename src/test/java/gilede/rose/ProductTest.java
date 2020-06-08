package gilede.rose;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductTest {

    @Test
    public void shouldSetValueTo50IfLargerThan50() {
        final Product product = new Product(10, 100);

        assertThat(product.getValue()).isEqualTo(50);
    }
    
    @Test
    public void shouldDecrementValueBy1EveryDay() {
        final Product product = new Product(10, 10);

        product.oneDayElapsed();

        assertThat(product.getValue()).isEqualTo(9);
    }
    
    @Test
    public void shouldDecrementValueBy2IfTheSellInLessThanZero() {
        final Product product = new Product(0, 10);

        product.oneDayElapsed();

        assertThat(product.getValue()).isEqualTo(8);
    }

    @Test
    public void shouldSetTheValueToZeroIfTheValueIsLessThanZero() {
        final Product product = new Product(0, 0);

        product.oneDayElapsed();

        assertThat(product.getValue()).isEqualTo(0);
    }
}