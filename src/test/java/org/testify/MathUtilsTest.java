package org.testify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {



    @Test
    void add() {
        int sum = MathUtils.add(4,5);
        assertEquals(9,sum);
    }

    @Test
    void subtract() {
        int result = MathUtils.subtract(1,2);
        assertEquals(-1,result);
    }

    @Test
    void multiply() {
        int result = MathUtils.multiply(3,5);
        assertEquals(15,result);
    }

    @Test
    void divide() {
        int result = MathUtils.divide(10,5);
        assertEquals(2,result);
    }

    @Test
    void isEven() {
        assertTrue(MathUtils.isEven(20));
        assertFalse(MathUtils.isEven(15));
    }

    @Test
    void isPositive() {
        MathUtils mathUtils = new MathUtils();
        assertTrue(mathUtils.isPositive(5));
        assertFalse(mathUtils.isPositive(-5));

    }

    @Test
    void modulusWithRounding() {
        assertEquals(0,MathUtils.modulusWithRounding(10,5));
    }
}
