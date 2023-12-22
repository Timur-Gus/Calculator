package com.calculator.calculator;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String calculatorPlus(@RequestParam int num1,@RequestParam int num2) {
        return num1 + " + " + num2 + " = " + calculator.calculatorPlus(num1, num2);
    }
    @GetMapping(path = "/minus")
    public String calculatorMinus(@RequestParam int num1,@RequestParam int num2) {
        return num1 + " - " + num2 + " = " + calculator.calculatorMinus(num1, num2);
    }
    @GetMapping(path = "/multiply")
    public String calculatorMultiply(@RequestParam int num1,@RequestParam int num2) {
        return num1 + " * " + num2 + " = " + calculator.calculatorMultiply(num1, num2);
    }
    @GetMapping(path = "/divide")
    public String calculatorDivide(@RequestParam int num1,@RequestParam int num2) {
        if (num2 == 0) {
            return "Деление на ноль невозможно";
        }
        return num1 + " / " + num2 +  " = " + calculator.calculatorDivide(num1, num2);
    }
}
