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
    public void testSubtract() {
        Calculator calculator1 = new Calculator();
        int a = 3;
        int b = 7;
        int subtractResult = calculator1.subtract(a, b);
        assertEquals(-4, subtractResult);
    }

    @Test
    public void testSquared() {
        Calculator calculator2 = new Calculator();
        int a = 4;
        int b = 0;
        int c = -2;
        int squaredResult = calculator2.squared(a);
        assertEquals(16, squaredResult);
        int squaredResult1 = calculator2.squared(b);
        assertEquals(0, squaredResult1);
        int squaredResult2 = calculator2.squared(c);
        assertEquals(4, squaredResult2);
    }
}
