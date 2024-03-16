package com.example.calculator.service;

import com.example.calculator.exception.CheckNullException;
import com.example.calculator.exception.DivideByZeroException;
import com.example.calculator.helper.HelperNull;
import org.springframework.stereotype.Service;

@Service
public class calculatorService {



    public String plus(Integer num1, Integer num2) {
        if (HelperNull.notSubmitted(num1) || HelperNull.notSubmitted(num2)) {
            throw new CheckNullException();
        }
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    public String minus(Integer num1, Integer num2) {
        if (HelperNull.notSubmitted(num1) || HelperNull.notSubmitted(num2)) {
            throw new CheckNullException();
        }
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    public String multiply(Integer num1, Integer num2) {
        if (HelperNull.notSubmitted(num1) || HelperNull.notSubmitted(num2)) {
            throw new CheckNullException();
        }
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    public String divide(Integer num1, Integer num2) {
        if (HelperNull.notSubmitted(num1) || HelperNull.notSubmitted(num2)) {
            throw new CheckNullException();
        }
        if (num2 == 0) {
            throw new DivideByZeroException();
        }
        int result = num1 / num2;
        return num1 + " / " + num2 + " = " + result;
    }
}
