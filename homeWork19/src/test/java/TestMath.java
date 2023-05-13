import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestMath {
    private Math math;

    @BeforeAll
    public void prepare() {
        math = new Math();
    }

    @Test
    public void plusTest() {
        double a = 5.0;
        double b = 10.0;
        assertThat(math.plus(a, b)).isEqualTo(15.0);
    }

    @Test
    public void minusTest() {
        double a = 15.0;
        double b = 10.0;
        assertThat(math.minus(a, b)).isEqualTo(5.0);
    }
}
