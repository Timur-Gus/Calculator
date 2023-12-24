package com.calculator.calculator;


import org.springframework.stereotype.Service;

@Service
public class Calculator implements CalculatorService  {
    @Override
    public String welcome() {
        return "<h1>Добро пожаловать в калькулятор.</h1>";
    }

    @Override
    public int calculatorPlus(int num1, int num2) {
        return num1 + num2;

    }
    @Override
    public int calculatorMinus(int num1, int num2) {
        return num1 - num2;
    }
    @Override
    public int calculatorMultiply(int num1, int num2) {
        return num1  * num2;
    }
    @Override
    public int calculatorDivide(int num1, int num2) {

        return num1 / num2;
    }
}
