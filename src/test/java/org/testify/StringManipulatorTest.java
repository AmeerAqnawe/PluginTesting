package org.testify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringManipulatorTest {
    StringManipulator stringManipulator;
    @BeforeEach
    void setup(){
        stringManipulator = new StringManipulator();
    }
    @Test
    void concatenate() {
        String result = stringManipulator.concatenate("Uni","Passau");
        assertEquals("UniPassau",result);
    }

    @Test
    void toUpperCase() {
        assertEquals("INFORMATIK", stringManipulator.toUpperCase("informatik"));
    }

    @Test
    void stringLength() {
        int expected = 5;
        assertEquals(expected,stringManipulator.stringLength("passau"));
    }

    @Test
    void longestSubstringWithoutRepeatingCharacters() {
        String expected = "a";
        assertEquals(expected,stringManipulator.longestSubstringWithoutRepeatingCharacters("aaaaaaaaa"));
    }

    @Test
    void countSubstringOccurrences() {
        String expected="";
    }
}
