package org.testify;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringManipulatorTest {


    @Test
    void TestStringLength() {
        StringManipulator manipulator = new StringManipulator();
        String testString = "test";
        Assertions.assertEquals(4, manipulator.stringLength(testString));
    }

    @Test
    void TestToUpperCase() {
        StringManipulator manipulator = new StringManipulator();
        String testString = "test";
        String expected = "TEST";
        Assertions.assertEquals(expected, manipulator.toUpperCase(testString));
    }

    @Test
    void TestConcatenate() {
        StringManipulator manipulator = new StringManipulator();
        String testString1 = "test";
        String testString2 = "tset";
        String expectedString = "testtset";
        Assertions.assertEquals(expectedString, manipulator.concatenate(testString1, testString2));
    }
}
