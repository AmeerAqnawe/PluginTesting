package org.testify;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComplexOperationsTest {

    @Test
    public void testIsAnagram() {
         ComplexOperations co = new ComplexOperations();

         assertTrue(co.isAnagram("earth", "heart"));
         assertTrue(co.isAnagram("", ""));
         assertTrue(co.isAnagram("Hall o", " Hallo"));

         assertTrue(co.isAnagram("earth", "earth"));
         assertFalse(co.isAnagram("earth", "eartha"));
        assertFalse(co.isAnagram("ab", "abc"));
        assertFalse(co.isAnagram("aba", "ab"));
    }

    @Test
    public void testIsAnagramExceptions() {
        assertThrows(IllegalArgumentException.class, () -> {
            ComplexOperations oc = new ComplexOperations();

            oc.isAnagram("", null);

        });

        assertThrows(IllegalArgumentException.class, () -> {
            ComplexOperations oc = new ComplexOperations();

            oc.isAnagram(null, null);

        });

        assertThrows(IllegalArgumentException.class, () -> {
            ComplexOperations oc = new ComplexOperations();

            oc.isAnagram("as", null);

        });

        assertThrows(IllegalArgumentException.class, () -> {
            ComplexOperations oc = new ComplexOperations();

            oc.isAnagram(null, "");

        });
    }

    @Test
    public void testCalculateSquare() {
        ComplexOperations co = new ComplexOperations();

        assertEquals(9, co.calculateSquare(3));
        assertEquals(81, co.calculateSquare(9));

        assertEquals(100*100, co.calculateSquare(100));

        assertEquals(1024*1024, co.calculateSquare(1024));

        assertThrows(IllegalArgumentException.class, () -> {
            ComplexOperations oc = new ComplexOperations();

            oc.calculateSquare(-10);

        });

    }

    @Test
    public void testFactorial() {
        ComplexOperations co = new ComplexOperations();

        assertEquals(1, co.factorial(0));
        assertEquals(1, co.factorial(1));
        assertEquals(2, co.factorial(2));

        assertEquals(36, co.calculateSquare(6));

        assertThrows(IllegalArgumentException.class, () -> {
            ComplexOperations oc = new ComplexOperations();

            oc.factorial(-10);

        });

    }

}
