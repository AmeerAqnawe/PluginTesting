package org.testify;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class ComplexOperationsTest {

    static ComplexOperations complexOperations;

    @BeforeAll
    static void initi(){
        complexOperations = new ComplexOperations();
    }

    @Test
    void test_calculateSquare(){
        Assertions.assertEquals(9, complexOperations.calculateSquare(3));
    }

}
