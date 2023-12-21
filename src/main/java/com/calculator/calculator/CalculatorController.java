package com.calculator.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
private final Calculator calculator;

    public CalculatorController(Calculator calculator) {
        this.calculator = calculator;
    }

    @GetMapping
    public String calculator() {
            return calculator.welcome();
    }

    @GetMapping(path = "/plus")
    public String calculatorPlus(String num1, String num2) {
        return calculator.calculatorPlus(num1, num2);
    }
    @GetMapping(path = "/minus")
    public String calculatorMinus(String num1, String num2) {
        return calculator.calculatorMinus(num1, num2);
    }
    @GetMapping(path = "/multiply")
    public String calculatorMultiply(String num1, String num2) {
        return calculator.calculatorMultiply(num1, num2);
    }
    @GetMapping(path = "/divide")
    public String calculatorDivide(String num1, String num2) {
        return calculator.calculatorDivide(num1, num2);
    }
}
