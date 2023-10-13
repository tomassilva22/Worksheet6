import org.example.RectangleCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class RectangleCalculatorTest {

    @Test
    public void testRectangleCalculator() {
        RectangleCalculator calculate = new RectangleCalculator();
        int perimeter = calculate.perimeter(3, 5);
        int perimeter2 = calculate.perimeter(5, 8);
        int perimeter3 = calculate.perimeter(2, 4);

        int area = calculate.area(3, 5);
        int area2 = calculate.area(5, 8);
        int area3 = calculate.area(2, 4);

        boolean isTriangle = calculate.isTriangle(2, 3, 4);

        assertEquals(16, perimeter, "Error calculating perimeter");
        assertEquals(26, perimeter2, "Error calculating perimeter");
        assertEquals(12, perimeter3, "Error calculating perimeter");

        assertEquals(15, area, "Error calculating area");
        assertEquals(40, area2, "Error calculating area");
        assertEquals(8, area3, "Error calculating area");

        assertTrue(isTriangle);
    }
}
