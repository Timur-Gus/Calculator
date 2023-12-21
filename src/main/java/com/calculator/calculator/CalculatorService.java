package com.calculator.calculator;

public interface CalculatorService {
    String welcome();
    String calculatorPlus(String num1, String num2);
    String calculatorMinus(String num1, String num2);
    String calculatorMultiply(String num1,String num2);
    String calculatorDivide(String num1,String num2);
}