package com.calculator.calculator;

public interface CalculatorService {
    String welcome();
    int calculatorPlus(int num1, int num2);
    int calculatorMinus(int num1, int num2);
    int calculatorMultiply(int num1,int num2);
    int calculatorDivide(int num1,int num2);
}