package testify;

import org.testify.ComplexOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ComplexOperationsTest {

    private final ComplexOperations operations = new ComplexOperations();

    @Test
    public void testCalculateSquare() {
        Assertions.assertEquals(4, operations.calculateSquare(2));
        Assertions.assertThrows(IllegalArgumentException.class, () -> operations.calculateSquare(-1));
    }

    @Test
    public void testCalculateCube() {
        Assertions.assertEquals(27, operations.calculateCube(3));
        Assertions.assertThrows(IllegalArgumentException.class, () -> operations.calculateCube(-1));
    }

    @Test
    public void testIsPrime() {
        assertTrue(operations.isPrime(5));
        Assertions.assertFalse(operations.isPrime(4));
    }

    @Test
    public void testFactorial() {
        Assertions.assertEquals(120, operations.factorial(5));
        Assertions.assertThrows(IllegalArgumentException.class, () -> operations.factorial(-1));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(operations.isPalindrome("madam"));
        Assertions.assertFalse(operations.isPalindrome("java"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> operations.isPalindrome(null));
    }

    @Test
    public void testGeneratePrimes() {
        List<Integer> primes = operations.generatePrimes(5);
        Assertions.assertEquals(List.of(2, 3, 5, 7, 11), primes);
    }

    @Test
    public void testCalculateFibonacci() {
        Assertions.assertEquals(5, operations.calculateFibonacci(5));
        Assertions.assertThrows(IllegalArgumentException.class, () -> operations.calculateFibonacci(-1));
    }

    @Test
    public void testIsAnagram() {
        assertTrue(operations.isAnagram("listen", "silent"));
        Assertions.assertFalse(operations.isAnagram("java", "javascript"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> operations.isAnagram(null, "test"));
    }
}
