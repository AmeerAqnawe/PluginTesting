package org.testify;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
}
