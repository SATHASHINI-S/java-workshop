package com.myjava.practice.lamdaInterface;

import com.lamdaInterface.Arithmetic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArithmeticTest {
    @Test
    public void testAddition(){
        Arithmetic addition = (int x,int y) -> x+y;
        Assertions.assertEquals(30,addition.calculate(10,20));
    }

    @Test
    public void testSubraction(){
        Arithmetic subtraction = (int x,int y) ->x-y;
        Assertions.assertEquals(20,subtraction.calculate(50,30));
    }

    @Test
    public void testMulti(){
        Arithmetic multiplication = (int x,int y) ->x*y;
        Assertions.assertEquals(25,multiplication.calculate(5,5));
    }

    @Test
    public void testDivision(){
        Arithmetic division = (int x,int y) ->x/y;
        Assertions.assertEquals(5,division.calculate(20,4));
    }


}
