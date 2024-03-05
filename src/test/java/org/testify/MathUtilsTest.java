package org.testify;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
  MathUtils mathUtils = new MathUtils();

  @Test
 public void testAdd(){
   assertEquals(5,mathUtils.add(2,3));
  }

 @Test
 public void testSubtract(){
  assertEquals(6,mathUtils.subtract(12,6));
 }

 @Test
 public void testMul(){
  assertEquals(12,mathUtils.multiply(2,6));
 }

 @Test
 public void testDiv(){
  assertEquals(3,mathUtils.divide(6,2));
 }

 @Test
 public void testDivZeroB(){
  assertThrows(ArithmeticException.class,()->{mathUtils.divide(9,0);});
 }

 @Test
 public void testIsEventTrue(){
  assertTrue(mathUtils.isEven(6));
 }

 @Test
 public void testIsEventFalse(){
  assertFalse(mathUtils.isEven(5));
 }

 @Test
 public void testIsPositiveTrue(){
  assertTrue(mathUtils.isPositive(6));
 }

 @Test
 public void testIsPossitiveFalse(){
  assertFalse(mathUtils.isPositive(-5));
 }

 @Test
 public void testmModulusWithRoundingValid(){
   assertEquals(1,mathUtils.modulusWithRounding(10,3));
 }

 @Test
 public void testmModulusWithRoundingEvenB(){
  assertEquals(1,mathUtils.modulusWithRounding(10,4));
 }

 @Test
 public void testmModulusWithRoundingOddA(){
  assertEquals(1,mathUtils.modulusWithRounding(9,3));
 }

 @Test
 public void testmModulusWithRoundingZeroB(){
  assertThrows(IllegalArgumentException.class,()->{mathUtils.modulusWithRounding(9,0);});
 }

}
