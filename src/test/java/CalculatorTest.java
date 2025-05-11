import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, Calculator.subtract(4, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(12, Calculator.multiply(3, 4));
    }

    @Test
    public void testDivide() {
        assertEquals(2.5, Calculator.divide(5, 2), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        Calculator.divide(5, 0);
    }
}
