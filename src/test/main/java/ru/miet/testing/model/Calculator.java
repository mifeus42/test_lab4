package ru.miet.testing.model;

public class Calculator implements ICalculator{
    @Override
    public double sum(double a, double b) {
        return a+b;
    }

    @Override
    public double subtract(double a, double b) {
        return a-b;
    }

    @Override
    public double multiply(double a, double b) {
        return a*b;
    }

    @Override
    public double divide(double a, double b) throws ArithmeticException{
        if(b != 0) {
            return a/b;
        }
        throw new ArithmeticException();
    }
}
