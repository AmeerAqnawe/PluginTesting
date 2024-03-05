package org.testify;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringManipulatorTest {
    @Test
    public void stringConc() {
        String test= "baa";
        String res;
        StringManipulator stringManipulator = new StringManipulator();
        res = stringManipulator.concatenate("b","aa");
        assertEquals(test,res);
    }
    @Test
    public void stringUpperCase() {
        String test= "STRING";
        String res;
        StringManipulator stringManipulator = new StringManipulator();
        res = stringManipulator.toUpperCase("string");
        assertEquals(test,res);
    }
    @Test
    public void stringLength (){
        int test= 6;
        int res;
        StringManipulator stringManipulator = new StringManipulator();
        res = stringManipulator.stringLength("string");
        assertEquals(test,res);
    }

    @Test
    public void stringLongstSubString() {
        String test= "stringl";
        String res;
        StringManipulator stringManipulator = new StringManipulator();
        res = stringManipulator.longestSubstringWithoutRepeatingCharacters("stringlll");
        assertEquals(test,res);
    }

    @Test
    public void stringContainsSubString() {
        String test= "string";
        String res;
        StringManipulator stringManipulator = new StringManipulator();
        res = stringManipulator.countSubstringOccurrences("stringlll","string");
        assertEquals(test,res);
    }



}
