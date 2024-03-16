package com.example.calculator.service;

import com.example.calculator.service.calculatorService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParametrizedCalculatorServiceTest {

    private final calculatorService calculatorService = new calculatorService();

    @ParameterizedTest
    @CsvSource({"10, 5, 15", "20, 5, 25"})
    void test_plus(int num1, int num2, int expectedResult) {
        String actualResult = calculatorService.plus(num1, num2);
        assertEquals(num1 + " + " + num2 + " = " + expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource({"10, 5, 5", "20, 5, 15"})
    void test_minus(int num1, int num2, int expectedResult) {
        String actualResult = calculatorService.minus(num1, num2);
        assertEquals(num1 + " - " + num2 + " = " + expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource({"10, 5, 50", "20, 5, 100"})
    void test_multiply(int num1, int num2, int expectedResult) {
        String actualResult = calculatorService.multiply(num1, num2);
        assertEquals(num1 + " * " + num2 + " = " + expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource({"10, 5, 2.0", "20, 5, 4.0"})
    void test_divide(int num1, int num2, double expectedResult) {
        String actualResult = calculatorService.divide(num1, num2);
        assertEquals(num1 + " / " + num2 + " = " + expectedResult, actualResult);
    }
}