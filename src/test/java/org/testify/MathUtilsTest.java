package org.testify;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathUtilsTest {
    @Test
    public void  testPos(){
        boolean expected = true;
        MathUtils mathUtils = new MathUtils();
        boolean res = mathUtils.isPositive(2);
        assertEquals(res,expected);
    }

    @Test
    public void  testEquals(){
        int expected = 5;
        int res = MathUtils.add(2,3);
        assertEquals(expected,res);
    }

    @Test
    public void  testSubstract(){
        int expected = -1;
        int res = MathUtils.subtract(2,3);
        assertEquals(expected,res);
    }

    @Test
    public void  testDev(){
        int expected = 1;
        int res = MathUtils.divide(2,2);
        assertEquals(expected,res);
    }

    @Test
    public void  testMul(){
        int expected = 0;
        int res = MathUtils.multiply(2,2);
        assertEquals(expected,res);
    }
    @Test
    public void  testEven(){
        boolean expected = false;
        boolean res = MathUtils.isEven(3);
        assertEquals(expected,res);
    }



    @Test
    public void  testModul(){
        int expected = 0;
        int res = MathUtils.modulusWithRounding(5,2);
        assertEquals(expected,res);
    }






}
