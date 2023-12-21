package com.calculator.calculator;


import org.springframework.stereotype.Service;

@Service
public class Calculator implements CalculatorService  {
    @Override
    public String welcome() {
        return "<h1>Добро пожаловать в калькулятор.</h1>";
    }

    @Override
    public String calculatorPlus(String num1, String num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка! Вы не ввели одно или оба значения!";
        }
        int sum = Integer.valueOf(num1) + Integer.valueOf(num2);
        return num1 + " + " + num2 + " = " + sum;

    }
    @Override
    public String calculatorMinus(String num1, String num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка! Вы не ввели одно или оба значения!";
        }
        int diff = Integer.valueOf(num1) - Integer.valueOf(num2);
        return num1 + " - " + num2 + " = " + diff;
    }
    @Override
    public String calculatorMultiply(String num1, String num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка! Вы не ввели одно или оба значения!";
        }
        int mult = Integer.valueOf(num1) * Integer.valueOf(num2);
        return num1 + " * " + num2 + " = " + mult;
    }
    @Override
    public String calculatorDivide(String num1, String num2) {
        if (num1 == null || num2 == null) {
            return "Ошибка! Вы не ввели одно или оба значения!";
        }
        if (Integer.valueOf(num2) == 0) {
            return "Деление на ноль невозможно";
        }
        int div = Integer.valueOf(num1) / Integer.valueOf(num2);
        return num1 + " / " + num2 + " = " + div;
    }
}
