package org.testify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexOperationsTest {

    ComplexOperations complexOperations;
    @BeforeEach
    void setup(){
        complexOperations = new ComplexOperations();
    }

    @Test
    void testCalculateSquare(){
        assertThrows(IllegalArgumentException.class, () -> {complexOperations.calculateSquare( -1);}, "Calculate Square should throw exception");
        assertEquals(16, complexOperations.calculateSquare(4),
                "Calculate Square should work");
    }

    @Test
    void testCalculateCube(){
        assertThrows(IllegalArgumentException.class, () -> {complexOperations.calculateCube( - 3);}, "Calculate Cube should throw exception");
        assertEquals(64, complexOperations.calculateCube(4),
                "Calculate Cube should work");
    }

    @Test
    void testIsPrime(){
        assertTrue(complexOperations.isPrime(3),
                "Is Prime should work");
        assertFalse(complexOperations.isPrime(4),
                "Is Prime should work");
    }

    @Test
    void testFactorial(){
        assertThrows(IllegalArgumentException.class, () -> {complexOperations.factorial( - 2);}, "Factorial should throw exception");
        assertEquals(4 * 3 * 2, complexOperations.factorial(4),
                "Factorial should work");
    }

    @Test
    void testIsPalindrome(){
        assertThrows(IllegalArgumentException.class, () -> {complexOperations.isPalindrome( null);}, "Is Palindrome should throw exception");
        assertTrue(complexOperations.isPalindrome("aba"),
                "Is Palindrome should work");
        assertTrue(complexOperations.isPalindrome("a"),
                "Is Palindrome should work");
        assertFalse(complexOperations.isPalindrome("abc"),
                "Is Palindrome should work");
    }

    @Test
    void testGeneratePrimes(){
        assertEquals(2, complexOperations.generatePrimes(1).get(0),
                "Generate Primes should work");
        assertEquals(3, complexOperations.generatePrimes(2).get(1),
                "Generate Primes should work");
        assertEquals(5, complexOperations.generatePrimes(3).get(2),
                "Generate Primes should work");
        assertEquals(7, complexOperations.generatePrimes(4).get(3),
                "Generate Primes should work");
    }

    @Test
    void testCalculateFibonacci(){
        assertThrows(IllegalArgumentException.class, () -> {complexOperations.calculateFibonacci( - 3);}, "Calculate Fibonacci should throw exception");
        assertEquals(1, complexOperations.calculateFibonacci(1),
                "Calculate Fibonacci should work");
        assertEquals(1, complexOperations.calculateFibonacci(2),
                "Calculate Fibonacci should work");
        assertEquals(2, complexOperations.calculateFibonacci(3),
                "Calculate Fibonacci should work");
        assertEquals(3, complexOperations.calculateFibonacci(4),
                "Calculate Fibonacci should work");
        assertEquals(5, complexOperations.calculateFibonacci(5),
                "Calculate Fibonacci should work");
    }

    @Test
    void testIsAnagram(){
        assertThrows(IllegalArgumentException.class, () -> {complexOperations.isAnagram( null, "abc");}, "Is Anagram should throw exception");
        assertThrows(IllegalArgumentException.class, () -> {complexOperations.isAnagram( "abc", null);}, "Is Anagram should throw exception");
        assertTrue(complexOperations.isAnagram("aba", "baa"),
                "Is Anagram should work");
        assertTrue(complexOperations.isAnagram("abcd", "dbac"),
                "Is Anagram should work");
        assertFalse(complexOperations.isAnagram("abc", "abd"),
                "Is Anagram should work");
    }

}
