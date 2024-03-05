package org.testify;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

       MathUtils mathUtils = new MathUtils();
       @Test
       public void isPositiveTestNegative() {
           assertFalse(mathUtils.isPositive(-1));
       }

       @Test
       public void isPositiveTestPositive() {
            assertTrue(mathUtils.isPositive(1));
       }

       @Test public void isPositiveTestZero() {
             assertFalse(mathUtils.isPositive(0));
       }
}
