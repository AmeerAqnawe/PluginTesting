package org.testify;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ComplexOperationsTest {

    private final ComplexOperations operations = new ComplexOperations();

    @Test
    public void testCalculateSquare() {
        assertEquals(4, operations.calculateSquare(2));
        assertThrows(IllegalArgumentException.class, () -> operations.calculateSquare(-1));
    }

    @Test
    public void testCalculateCube() {
        assertEquals(27, operations.calculateCube(3));
        assertThrows(IllegalArgumentException.class, () -> operations.calculateCube(-1));
    }

    @Test
    public void testIsPrime() {
        assertTrue(operations.isPrime(5));
        Assertions.assertFalse(operations.isPrime(4));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, operations.factorial(5));
        assertThrows(IllegalArgumentException.class, () -> operations.factorial(-1));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(operations.isPalindrome("madam"));
        Assertions.assertFalse(operations.isPalindrome("java"));
        assertThrows(IllegalArgumentException.class, () -> operations.isPalindrome(null));
    }

    @Test
    public void testGeneratePrimes() {
        List<Integer> primes = operations.generatePrimes(5);
        assertEquals(List.of(2, 3, 5, 7, 11), primes);
    }

    @Test
    public void testCalculateFibonacci() {
        assertEquals(5, operations.calculateFibonacci(5));
        assertThrows(IllegalArgumentException.class, () -> operations.calculateFibonacci(-1));
    }

    @Test
    public void testIsAnagram() {
        assertTrue(operations.isAnagram("listen", "silent"));
        Assertions.assertFalse(operations.isAnagram("java", "javascript"));
        assertThrows(IllegalArgumentException.class, () -> operations.isAnagram(null, "test"));
    }
}
