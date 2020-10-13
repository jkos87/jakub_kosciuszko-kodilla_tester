package com.kodilla.basic_assertion;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubstract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int substractResult = calculator.subtract(a, b);
        assertEquals(-3, substractResult);
    }

    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        int a = 5;
        int squareResult = calculator.square(a);
        assertEquals(25, squareResult);
    }
    @Test
    public void testSquare2() {
        Calculator cal1 = new Calculator();
        int a = -5;
        int squareResult2 = cal1.square(a);
        assertEquals(25, squareResult2);
    }
    @Test
    public void testSquare3(){
        Calculator cal2 = new Calculator();
        int a = 0;
        int squareResult3 = cal2.square(a);
        assertEquals(0,squareResult3);
    }
}
