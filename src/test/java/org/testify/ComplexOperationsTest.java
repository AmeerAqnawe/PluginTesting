package org.testify;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComplexOperationsTest {

    @Test
    void TestCalculateSquare() {
        ComplexOperations complexOperations = new ComplexOperations();

        Assertions.assertEquals(4, complexOperations.calculateSquare(2));
    }

    @Test
    void TestCalculateSquareThrowsException() {
        ComplexOperations complexOperations = new ComplexOperations();

        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> complexOperations.calculateSquare(-3)
                );
    }

}
