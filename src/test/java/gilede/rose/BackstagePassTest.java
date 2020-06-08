package gilede.rose;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BackstagePassTest {

    @Test
    public void shouldIncreaseValueBy1Before10Days() {
        final BackstagePass backstagePass = new BackstagePass(10, 10);

        backstagePass.oneDayElapsed();

        assertThat(backstagePass.getValue()).isEqualTo(11);
    }
    
    @Test
    public void shouldIncreaseValueBy2Between5And10Days() {
        final BackstagePass backstagePass = new BackstagePass(5, 10);

        backstagePass.oneDayElapsed();

        assertThat(backstagePass.getValue()).isEqualTo(12);
    }
}