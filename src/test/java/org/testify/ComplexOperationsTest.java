package org.testify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ComplexOperationsTest {
    ComplexOperations complexOperations;
    @BeforeEach
    void setup(){
         complexOperations = new ComplexOperations();

    }

  @Test
    void calculateSquare() {
        int result =complexOperations.calculateSquare(4);
        assertEquals(16,result);
    }

    @Test
    void calculateCube() {
        int result = complexOperations.calculateCube(3);
        assertEquals(result,9);
    }

    @Test
    void isPrime() {
       assertTrue(complexOperations.isPrime(7));
    }

    @Test
    void factorial() {
        int result = complexOperations.factorial(5);
        assertEquals(120,result);
    }

    @Test
    void isPalindrome() {
        assertTrue(complexOperations.isPalindrome("aba"));
        assertFalse(complexOperations.isPalindrome("abb"));


    }

    @Test
    void generatePrimes() {
        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        assertEquals(primes,complexOperations.generatePrimes(4));


    }

    @Test
    void calculateFibonacci() {
        assertEquals(0,complexOperations.calculateFibonacci(0));
        assertEquals(2,complexOperations.calculateFibonacci(3));



    }

    @Test
    void isAnagram() {
        assertThrows(IllegalArgumentException.class,()->complexOperations.isAnagram(null,null));
    }
}
