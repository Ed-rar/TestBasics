package com.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void addition() {
        assertEquals(30, calculator.addition(10,20),0);
    }

    @Test
    public void subtraction() {
        assertEquals(30, calculator.subtraction(50,20),0);
    }

    @Test
    public void multiplicationSuccess() {
        assertEquals(30, calculator.multiplication(6,5),0);
    }

    @Test
    public void multiplicationFailed(){
        assertNotEquals(45, calculator.multiplication(6,5), 0);
    }
    @Test
    public void division() {
        assertEquals(30,calculator.division(150,5),0);
    }

    @Test
    public void divisionNaN() {
        //"NaN" as a Double not a String
        // failed test
        assertEquals("NaN", calculator.division(0,0));
    }

}