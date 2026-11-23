package com.exemple;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
	private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAddition() {
        assertEquals(5, calculator.addition(2, 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, calculator.subtraction(5, 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(12, calculator.multiplication(3, 4));
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.division(10, 5));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class,
                () -> calculator.division(10, 0));
    }
}

