package com.example.HW_2_12_2.service;

import com.example.HW_2_12_2.exeption.DivideByZeroException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new DivideByZeroException("На ноль делить нельзя!");
        }
        return num1 / num2;
    }
}