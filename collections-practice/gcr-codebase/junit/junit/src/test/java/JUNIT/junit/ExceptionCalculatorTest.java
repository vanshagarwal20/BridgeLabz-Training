package JUNIT.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExceptionCalculatorTest {

    ExceptionCalculator calculator = new ExceptionCalculator();

    @Test
    void testDivideByZeroException() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
    }

    @Test
    void testDivideValid() {
        assertEquals(5, calculator.divide(10, 2));
    }
}

