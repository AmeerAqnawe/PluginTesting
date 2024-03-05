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
}
