package org.testify;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringManipulatorTest {


    @Test
    void TeststringLength() {
        StringManipulator manipulator = new StringManipulator();
        String testString = "test";
        Assertions.assertEquals(4, manipulator.stringLength(testString));
    }
}
