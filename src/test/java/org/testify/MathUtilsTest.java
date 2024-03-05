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

       @Test
       public void isPositiveTestZero() {
             assertFalse(mathUtils.isPositive(0));
       }

        @Test
        public void moduloWithRoundingTestError() {
           assertThrows(IllegalArgumentException.class,
                   ()-> { MathUtils.modulusWithRounding(10, 0);},
                   "IllegalArgumentException was supposed to be thrown."
           );
        }

        @Test
        public void moduloWithRoundingTestRounding() {
           assertEquals(10, MathUtils.modulusWithRounding(9,90));
        }

        @Test void moduloWithRoundingTestNoRounding() {
           assertEquals(0, MathUtils.modulusWithRounding(90, 9));
        }
}
