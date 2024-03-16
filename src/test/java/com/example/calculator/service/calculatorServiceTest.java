package com.example.calculator.service;

import com.example.calculator.exception.IllegalArgumentException;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class calculatorServiceTest {

    private final calculatorService calculatorService = new calculatorService();


    @Test
    void start_success() {
        //Подготовка ожидаемого результата
        String expectedResult = "Добро пожаловать в калькулятор.";
        //Начала теста
        String actualResult = calculatorService.start();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void plus_success() {
        //Подготовка входных данных
        int num1 = 10;
        int num2 = 5;
        int result1 = num1 + num2;
        int num3 = 10;
        int num4 = 5;
        int result2 = num3 + num4;
        //Подготовка ожидаемого результата
        String expectedResult1 = num1 + " + " + num2 + " = " + result1;
        String expectedResult2 = num3 + " + " + num4 + " = " + result2;
        //Начала теста
        String actualResult1 = calculatorService.plus(num1, num2);
        String actualResult2 = calculatorService.plus(num3, num4);
        assertEquals(expectedResult1, actualResult1);
        assertEquals(expectedResult2, actualResult2);
    }

    @Test
    void minus_success() {
        //Подготовка входных данных
        int num1 = 10;
        int num2 = 5;
        int result1 = num1 - num2;
        int num3 = 10;
        int num4 = 5;
        int result2 = num3 - num4;
        //Подготовка ожидаемого результата
        String expectedResult1 = num1 + " - " + num2 + " = " + result1;
        String expectedResult2 = num3 + " - " + num4 + " = " + result2;
        //Начала теста
        String actualResult1 = calculatorService.minus(num1, num2);
        String actualResult2 = calculatorService.minus(num3, num4);
        assertEquals(expectedResult1, actualResult1);
        assertEquals(expectedResult2, actualResult2);
    }

    @Test
    void multiply_success() {
        //Подготовка входных данных
        int num1 = 10;
        int num2 = 5;
        int result1 = num1 * num2;
        int num3 = 10;
        int num4 = 5;
        int result2 = num3 * num4;
        //Подготовка ожидаемого результата
        String expectedResult1 = num1 + " * " + num2 + " = " + result1;
        String expectedResult2 = num3 + " * " + num4 + " = " + result2;
        //Начала теста
        String actualResult1 = calculatorService.multiply(num1, num2);
        String actualResult2 = calculatorService.multiply(num3, num4);
        assertEquals(expectedResult1, actualResult1);
        assertEquals(expectedResult2, actualResult2);
    }

    @Test
    void divide_success() {
        //Подготовка входных данных
        int num1 = 10;
        int num2 = 5;
        double result1 = (double) num1 / (double) num2;
        int num3 = 10;
        int num4 = 5;
        double result2 = (double) num3 / (double) num4;
        //Подготовка ожидаемого результата
        String expectedResult1 = num1 + " / " + num2 + " = " + result1;
        String expectedResult2 = num3 + " / " + num4 + " = " + result2;
        //Начала теста
        String actualResult1 = calculatorService.divide(num1, num2);
        String actualResult2 = calculatorService.divide(num3, num4);
        assertEquals(expectedResult1, actualResult1);
        assertEquals(expectedResult2, actualResult2);
    }

    @Test
    void dividing_zero_error() {
        //Подготовка входных данных
        int num1 = 10;
        int num2 = 0;
        //Подготовка ожидаемого результата
        //Начала теста
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(num1, num2));
    }
}