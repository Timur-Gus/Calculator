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
    public String calculatorPlus(Intenger num1, Intenger num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка! Вы не ввели одно или оба значения!";
        }
        return calculator.calculatorPlus(num1, num2);;
    }
    @GetMapping(path = "/minus")
    public String calculatorMinus(Intenger num1, Intenger num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка! Вы не ввели одно или оба значения!";
        }
        return calculator.calculatorMinus(num1, num2);
    }
    @GetMapping(path = "/multiply")
    public String calculatorMultiply(Intenger num1, Intenger num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка! Вы не ввели одно или оба значения!";
        }
        return calculator.calculatorMultiply(num1, num2);
    }
    @GetMapping(path = "/divide")
    public String calculatorDivide(Intenger num1, Intenger num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка! Вы не ввели одно или оба значения!";
        }
        else if (Integer.valueOf(num2) == 0) {
            return "Деление на ноль невозможно";
        }
        return calculator.calculatorDivide(num1, num2);
    }
}
