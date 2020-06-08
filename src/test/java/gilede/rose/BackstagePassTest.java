package gilede.rose;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BackstagePassTest {

    @Test
    public void shouldIncrementValueBy1Before10Days() {
        final BackstagePass backstagePass = new BackstagePass(10, 10);

        backstagePass.oneDayElapsed();

        assertThat(backstagePass.getValue()).isEqualTo(11);
    }
}