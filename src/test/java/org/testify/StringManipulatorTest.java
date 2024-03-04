package org.testify;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class StringManipulatorTest {

    static StringManipulator stringManipulator;

    @BeforeAll
    static void init(){
        stringManipulator = new StringManipulator();
    }

    @Test
    void test_concatenate(){
        Assertions.assertEquals("test", stringManipulator.concatenate("tes", "t"));
    }

}
