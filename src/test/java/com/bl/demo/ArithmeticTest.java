package com.bl.demo;

import org.junit.Assert;
import org.junit.Test;

public class ArithmeticTest {
    //Addition
    @Test
    public void given_TwoNumber_WhenAdd_ReturnAddition() {
        Arithmetic arithmetic = new Arithmetic();
        int result = arithmetic.Addition(10,40);
        Assert.assertEquals(50,result);
    }
    //Subtraction
    @Test
    public void given_TwoNumber_WhenSub_ReturnSubtraction() {
        Arithmetic arithmetic = new Arithmetic();
        int result = arithmetic.Subtraction(10,40);
        Assert.assertEquals(-30,result);
    }
    //Division
    @Test
    public void given_TwoNumber_WhenDiv_ReturnDivision() {
        Arithmetic arithmetic = new Arithmetic();
        int result = arithmetic.Division(15,3);
        Assert.assertEquals(5,result);
    }
    //Multiplication
    @Test
    public void given_TwoNumber_WhenMul_ReturnMultiplication() {
        Arithmetic arithmetic = new Arithmetic();
        int result = arithmetic.Multiplication(4,5);
        Assert.assertEquals(20,result);
    }
}
