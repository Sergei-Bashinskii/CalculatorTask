package com.example.calculator.controller;

import com.example.calculator.exception.CheckNullException;
import com.example.calculator.exception.DivideByZeroException;
import com.example.calculator.service.calculatorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class calculatorController {

    private final calculatorService service;

    public calculatorController(calculatorService service) {
        this.service = service;
    }

    @ExceptionHandler(DivideByZeroException.class)
    public ResponseEntity<String> messageDivideByZero() {
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Делить на 0 нельзя.");
    }


    @ExceptionHandler(CheckNullException.class)
    public ResponseEntity<String> messageCheckNull() {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Неверный ввод данных.");
    }

    @GetMapping
    public String start() {
        return "Добро пожаловать в калькулятор.";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam("num1") Integer num1,
                    @RequestParam("num2") Integer num2) {
        return service.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam("num1") Integer num1,
                    @RequestParam("num2") Integer num2) {
        return service.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") Integer num1,
                    @RequestParam("num2") Integer num2) {
        return service.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("num1") Integer num1,
                    @RequestParam("num2") Integer num2) {
        return service.divide(num1, num2);
    }
}