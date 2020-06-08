package gilede.rose;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductTest {

    @Test
    public void shouldSetValueTo50IfLargerThan50() {
        final Product product = new Product(10, 100);

        assertThat(product.getValue()).isEqualTo(50);
    }
}