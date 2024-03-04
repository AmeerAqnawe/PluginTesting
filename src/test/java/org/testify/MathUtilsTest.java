package org.testify;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 class MathUtilsTest {

    @Test
     void testAdd() {
        Assertions.assertEquals(5, MathUtils.add(2, 3));
    }

    @Test
     void testSubtract() {
        assertEquals(-1, MathUtils.subtract(2, 3));
    }

    @Test
     void testMultiply() {
        assertEquals(0, MathUtils.multiply(2, 3));
    }

    @Test
     void testDivide() {
        assertEquals(2, MathUtils.divide(6, 3));
    }

    @Test
     void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> MathUtils.divide(1, 0));
    }

    @Test
     void testIsEven() {
        assertTrue(MathUtils.isEven(2));
        assertFalse(MathUtils.isEven(3));
    }

    @Test
     void testIsPositive() {
        MathUtils mathUtils = new MathUtils();
        assertTrue(mathUtils.isPositive(1));
        assertFalse(mathUtils.isPositive(-1));
    }

    @Test
     void testModulusWithRounding() {
        assertEquals(0, MathUtils.modulusWithRounding(5, 3));
    }

    @Test
     void testModulusWithRoundingByZero() {
        assertThrows(IllegalArgumentException.class, () -> MathUtils.modulusWithRounding(5, 0));
    }
}
