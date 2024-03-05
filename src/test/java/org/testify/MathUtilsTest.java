package org.testify;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

  @Test
  void TestIsPositive() {
   MathUtils mathUtils = new MathUtils();
   Assertions.assertTrue(mathUtils.isPositive(2));
  }

}
