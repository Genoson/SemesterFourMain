package com.classprojectmay18;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class SimpleCalculatorTest {

    private SimpleCalculator calculatorUnderTest = new SimpleCalculator();
   
    @Test
    void testClassExists() {
        assertTrue(SimpleCalculator.class.getName().equals("com.classprojectmay18.SimpleCalculator"));
    }

    @Test
    public void testAdd() {
        assertEquals(3, calculatorUnderTest.add(1, 2));

        assertEquals(-1, calculatorUnderTest.add(1, -2));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculatorUnderTest.subtract(3, 2));

        assertEquals(3, calculatorUnderTest.subtract(1, -2));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculatorUnderTest.multiply(2, 3));

        assertEquals(0, calculatorUnderTest.multiply(2, 0));

        assertEquals(-6, calculatorUnderTest.multiply(2, -3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculatorUnderTest.divide(6, 3));

        assertEquals(0, calculatorUnderTest.divide(0, 6));
        
    }

}
