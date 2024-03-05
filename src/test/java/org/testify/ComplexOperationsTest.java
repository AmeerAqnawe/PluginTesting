package org.testify;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComplexOperationsTest {
    @Test
    public void testCalculateSquare() {

        int n = 9;
        int result;
        ComplexOperations complexOperations = new ComplexOperations();
        result = complexOperations.calculateSquare(3);

        assertEquals(n, result);
    }

    @Test
    public void testCalculateCub() {

        int n = 8;
        int result;
        ComplexOperations complexOperations = new ComplexOperations();
        result = complexOperations.calculateCube(2);

        assertEquals(n, result);
    }

    @Test
    public void testIfPrime() {

        int n = 2;
        boolean result;
        ComplexOperations complexOperations = new ComplexOperations();
        result = complexOperations.isPrime(n);

        assertEquals(true, result);
    }

    @Test
    public void testFac() {

        int fac = 6;
        int result;
        ComplexOperations complexOperations = new ComplexOperations();
        result = complexOperations.factorial(3);

        assertEquals(fac, result);
    }

    @Test
    public void testPalandirom() {

        String s = "blb";
        boolean result;
        ComplexOperations complexOperations = new ComplexOperations();
        result = complexOperations.isPalindrome(s);

        assertEquals(true, result);
    }

    @Test

    public void testListOfPrimes(){
        List<Integer> myList = new ArrayList<>();
        List<Integer> testList = new ArrayList<>();

        myList.add(2);
        myList.add(3);
        myList.add(5);
        myList.add(7);
        myList.add(11);
        myList.add(13);
        myList.add(17);

        ComplexOperations complexOperations = new ComplexOperations();
        testList= complexOperations.generatePrimes(7);

        assertEquals(myList,testList);

    }

    @Test
    public void testFab() {

        int n = 8;
        int result;
        ComplexOperations complexOperations = new ComplexOperations();
        result = complexOperations.calculateFibonacci(6);

        assertEquals(8, result);
    }

    @Test

    public  void testAnagram() {
        String s1= "anagram";
        String s2= "margana";
        boolean expected = true;
        boolean result;
        ComplexOperations complexOperations = new ComplexOperations();
        result= complexOperations.isAnagram(s1,s2);
        assertEquals(result,expected);

    }



}
