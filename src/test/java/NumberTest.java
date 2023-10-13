import org.example.Number;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class NumberTest {

    private Number number;

    @BeforeEach
    public void setUp() {
        number = new Number();
    }

    @Test
    public void testAverage() {
        int actualAverage = number.average(252);
        assertSame(3, actualAverage, "Average failed");
    }

}
