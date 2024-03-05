package org.testify;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ComplexOperationsTest {
    ComplexOperations complexOperations = new ComplexOperations();

    @Test
    public void testValidCalculateSquare() {
        int res = complexOperations.calculateSquare(3);
        assertEquals(9, res);
    }

    // testInvalid

    @Test
    public void testValidCalculateCube() {
        int res = complexOperations.calculateCube(3);
        assertEquals(27, res);
    }

    @Test
    public void testValidIsPrime (){
        assertTrue(complexOperations.isPrime(7));
    }

    @Test
    public void testNegativeIsPrime (){
        assertFalse(complexOperations.isPrime(-7));
    }

    @Test
    public void testNotPrimeIsPrime (){
        assertFalse(complexOperations.isPrime(8));
    }

    @Test
    public void testFactorialZeroValid(){
        assertEquals(1,complexOperations.factorial(0));
    }

    @Test
    public void testFactorialOneValid(){
        assertEquals(1,complexOperations.factorial(1));
    }

    @Test
    public void testFactorialThreeValid(){
        assertEquals(6,complexOperations.factorial(3));
    }

    //testError

    @Test
    public void testIsPalindromeTrue(){
        assertTrue(complexOperations.isPalindrome("asdsa"));
    }

    @Test
    public void testIsPalindromeFalse(){
        assertFalse(complexOperations.isPalindrome("asdasd"));
    }

    @Test
    public void testIsGeneratePrimesValid(){
        List<Integer> actual = Arrays.asList(2,3,5,7);
        List<Integer> expected = complexOperations.generatePrimes(4);

        assertArrayEquals(actual.toArray(),expected.toArray());
    }

    //Test error

    @Test
    public void testCalculateFibonacciValid(){

        assertEquals(5,complexOperations.calculateFibonacci(5));
    }

    @Test
    public void testCalculateFibonacciForOne(){

        assertEquals(1,complexOperations.calculateFibonacci(1));
    }

    // Test error

    @Test
    public void testIsAnagramValid(){
        assertTrue(complexOperations.isAnagram("abcd","cdba"));
    }

    @Test
    public void testIsAnagramInvalidDifferentLength(){
        assertFalse(complexOperations.isAnagram("abcdx","cdba"));
    }

    @Test
    public void testIsAnagramInvalidSameLength(){
        assertFalse(complexOperations.isAnagram("abcx","cdba"));
    }

    // test error

}