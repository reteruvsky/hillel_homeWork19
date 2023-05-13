import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestArrayMethods {
    private FileLogger fileLogger;
    private ArrayMethods arrayMethods;

    @BeforeAll
    public void prepare() {
        fileLogger = new FileLogger(new FileLoggerConfiguration(15, LoggingLevel.DEBUG, "[%t][tf][%m]", "debug.txt"));
        arrayMethods = new ArrayMethods();
    }

    @Test
    public void maxIndexTest() {
        int[] array = {-11, 12, 13, -14, 15, 16, 17, -18, 19, 20};
        int max = arrayMethods.maxIndex(array);
        fileLogger.info("Maximum expected: " + 20 + " actual: " + max);
    }

    @Test
    public void minIndexTest() {
        int[] array = {-1, 2, 3, -4, 5, 6, 7, -8, 9, 10};
        int min = arrayMethods.minIndex(array);
        fileLogger.info("Minimal expected: " + -8 + " actual: " + min);
    }
}
