package org.testify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void testAdd(){
        assertEquals(7, MathUtils.add(4, 3),
                "Add should work");
        assertEquals(-1, MathUtils.add(-4, 3),
                "Add should work");
    }

    @Test
    void testSubtract(){
        assertEquals(1, MathUtils.subtract(4, 3),
                "Subtract should work");
        assertEquals(-7, MathUtils.subtract(-4, 3),
                "Subtract should work");
    }

    @Test
    void testMultiply(){
        assertEquals(12, MathUtils.multiply(4, 3),
                "Multiply should work");
        assertEquals(-8, MathUtils.multiply(-4, 2),
                "Multiply should work");
    }

    @Test
    void testDivide(){
        assertThrows(IllegalArgumentException.class, () -> {MathUtils.divide( 5, 0);}, "Divide should throw exception");
        assertEquals(2, MathUtils.divide(4, 2),
                "Divide should work");
        assertEquals(-2, MathUtils.divide(-4, 2),
                "Divide should work");
        assertEquals(-2, MathUtils.divide(5, 2),
                "Divide should work");
    }

    @Test
    void testIsEven(){
        assertTrue(MathUtils.isEven(4),
                "Is Even should work");
        assertFalse(MathUtils.isEven(3),
                "Is Even should work");
    }

    @Test
    void testIsPositive(){
        MathUtils mathUtils = new MathUtils();
        assertTrue(mathUtils.isPositive(4),
                "Is Positive should work");
        assertFalse(mathUtils.isPositive(0),
                "Is Positive should work");
        assertFalse(mathUtils.isPositive(-1),
                "Is Positive should work");
    }

    @Test
    void testModulusWithRounding(){
        assertThrows(IllegalArgumentException.class, () -> {MathUtils.modulusWithRounding( 3, 0);}, "Modulus With Rounding should throw exception");
        assertEquals(0, MathUtils.modulusWithRounding(4, 2),
                "Modulus With Rounding should work");
        assertEquals(1, MathUtils.modulusWithRounding(3, 4),
                "Modulus With Rounding should work");
    }
}
